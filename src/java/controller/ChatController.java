package controller;

import dal.ConversationDAO;
import dal.MessageDAO;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import model.Conversation;
import model.Message;

@ServerEndpoint("/chat/{conversationID}")
public class ChatController {

    //nhiều luồng có thể truy cập bản đồ cùng một lúc mà không ảnh hưởng đến tính nhất quán của các mục trong bản đồ.
    //Return a copy of the Set of all the open web socket sessions that represent connections to the same endpoint to which this session represents a connection.
    //Có nghĩa là, nhiều luồng có thể truy cập và sửa đổi nó cùng một lúc.
    private static Set<Session> userSessions = Collections.newSetFromMap(new ConcurrentHashMap<Session, Boolean>());

    //called when a new web socket session is open.
    @OnOpen
    public void onOpen(Session curSession, @PathParam("conversationID") String room) {
        curSession.getUserProperties().put("conversationID", room);
        System.out.println("room enter: "+room);
        for (Session ses : userSessions) {//Return a reference a RemoteEndpoint object representing the peer of this conversation that is able to send messages asynchronously to the peer.
            ses.getAsyncRemote().sendText("access");
//            UOA uoa = new UOA();
//            uoa.insert(id, curSession.getId());
        }
        System.out.println(curSession.getId());
        userSessions.add(curSession);
    }
    //called when a web socket session is closing.

    @OnClose
    public void onClose(Session curSession, @PathParam("conversationID") String room) {
        userSessions.remove(curSession);
        for (Session ses : userSessions) {//Return a reference a RemoteEndpoint object representing the peer of this conversation that is able to send messages asynchronously to the peer.
            
            ses.getAsyncRemote().sendText("out");
        }
    }

    @OnMessage
    public void onMessage(@PathParam("conversationID")String room ,String message, Session userSession) {
        for (Session ses : userSessions) {
            String [] sp = message.split(",");
            ConversationDAO cd = new ConversationDAO();
            //get room by 2 user
            MessageDAO md = new MessageDAO();
            System.out.println(message);
            String conv = Integer.toString(cd.getConversationByUserID(Integer.parseInt(sp[0]), Integer.parseInt(sp[2])).getConversationID());
            if(conv!=null && ses.getUserProperties().get("conversationID").equals(conv)){
                Message m = new Message();
                m.setConversationID(Integer.parseInt(sp[3]));
                m.setSender(Integer.parseInt(sp[0]));
                m.setReceiver(Integer.parseInt(sp[2]));
                m.setContent(sp[1]);
                md.insertMessage(m);
                String text = "         <li class=\"message d-inline-flex\">\n" +
"                                        <div class=\"message__aside\">\n" +
"                                            <a href=\"fixed-instructor-profile.html\"\n" +
"                                               class=\"avatar\">\n" +
"                                                <img src=\"/HappyHappy/user/assets/images/people/110/guy-6.jpg\"\n" +
"                                                     alt=\"people\"\n" +
"                                                     class=\"avatar-img rounded-circle\">\n" +
"                                            </a>\n" +
"                                        </div>\n" +
"                                        <div class=\"message__body card\">\n" +
"                                            <div class=\"card-body\">\n" +
"                                                <div class=\"d-flex align-items-center\">\n" +
"                                                    <div class=\"flex mr-3\">\n" +
"                                                        <a href=\"fixed-instructor-profile.html\"\n" +
"                                                           class=\"text-body\"><strong>Sender</strong></a>\n" +
"                                                    </div>\n" +
"                                                    <div>\n" +
"                                                        <small class=\"text-muted\">just now</small>\n" +
"                                                    </div>\n" +
"                                                </div>\n" +
"                                                <span class=\"text-black-70\">"+sp[1]+"</span>\n" +
"\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                    </li>";
                ses.getAsyncRemote().sendText(text);
//                System.out.println(message);
//                System.out.println(room);
            }
            
//            System.out.println(message.toString() + " msg");
        }
    }
}
