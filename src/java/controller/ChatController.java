package controller;

import dal.ConversationDAO;
import dal.MessageDAO;
import dal.UserDAO;
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
import model.UserCommon;
import org.json.JSONObject;

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
//        System.out.println("room enter: " + room);
//        for (Session ses : userSessions) {//Return a reference a RemoteEndpoint object representing the peer of this conversation that is able to send messages asynchronously to the peer.
//            ses.getAsyncRemote().sendText("access");
////            UOA uoa = new UOA();
////            uoa.insert(id, curSession.getId());
//        }
//        System.out.println(curSession.getId());
        userSessions.add(curSession);
    }
    //called when a web socket session is closing.

    @OnClose
    public void onClose(Session curSession, @PathParam("conversationID") String room) {
        userSessions.remove(curSession);
//        for (Session ses : userSessions) {//Return a reference a RemoteEndpoint object representing the peer of this conversation that is able to send messages asynchronously to the peer.
//            
//            ses.getAsyncRemote().sendText("out");
//        }
    }

    @OnMessage
    public void onMessage(@PathParam("conversationID") String room, String message, Session userSession) {
        try {
            for (Session ses : userSessions) {

                ConversationDAO cd = new ConversationDAO();
                //get room by 2 user
                MessageDAO md = new MessageDAO();
//                System.out.println(message);
                JSONObject data = new JSONObject(message);
                String conv = Integer.toString(cd.getConversationByUserID(data.getInt("from"), data.getInt("to")).getConversationID());
                if (conv != null && ses.getUserProperties().get("conversationID").equals(conv)) {
                    Message m = new Message();
                    UserDAO ud = new UserDAO();
                    m.setConversationID(data.getInt("convID"));
                    m.setSender(data.getInt("from"));
                    m.setReceiver(data.getInt("to"));
                    m.setContent(data.getString("msg"));
                    md.insertMessage(m);
                    UserCommon u1 = ud.getAccountByID(Integer.toString(data.getInt("from")));
                    UserCommon u2 = ud.getAccountByID(Integer.toString(data.getInt("to")));
                    String text = "         <li class=\"message d-inline-flex\">\n"
                            + "                                        <div class=\"message__aside\">\n"
                            + "                                            <a href=\"fixed-instructor-profile.html\"\n"
                            + "                                               class=\"avatar\">\n"
                            + "                                                <img src=\"" + u1.getImgAvt() + "\"\n"
                            + "                                                     alt=\"people\"\n"
                            + "                                                     class=\"avatar-img rounded-circle\">\n"
                            + "                                            </a>\n"
                            + "                                        </div>\n"
                            + "                                        <div class=\"message__body card\">\n"
                            + "                                            <div class=\"card-body\">\n"
                            + "                                                <div class=\"d-flex align-items-center\">\n"
                            + "                                                    <div class=\"flex mr-3\">\n"
                            + "                                                        <a href=\"fixed-instructor-profile.html\"\n"
                            + "                                                           class=\"text-body\"><strong>" + u1.getName() + "</strong></a>\n"
                            + "                                                    </div>\n"
                            + "                                                    <div>\n"
                            + "                                                        <small class=\"text-muted\">just now</small>\n"
                            + "                                                    </div>\n"
                            + "                                                </div>\n"
                            + "                                                <span class=\"text-black-70\">" + data.getString("msg") + "</span>\n"
                            + "\n"
                            + "                                            </div>\n"
                            + "                                        </div>\n"
                            + "                                    </li>";

                    ses.getAsyncRemote().sendText(text);
//                System.out.println(message);
//                System.out.println(room);
                }

//            System.out.println(message.toString() + " msg");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
