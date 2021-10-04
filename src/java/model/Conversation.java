/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Conversation {
    private int conversationID;
    private int userID1;
    private int userID2;
    private String createTime;
    public Conversation() {
    }

    public Conversation(int conversationID, int userID1, int userID2, String createTime) {
        this.conversationID = conversationID;
        this.userID1 = userID1;
        this.userID2 = userID2;
        this.createTime = createTime;
    }

    public int getConversationID() {
        return conversationID;
    }

    public void setConversationID(int conversationID) {
        this.conversationID = conversationID;
    }

    public int getUserID1() {
        return userID1;
    }

    public void setUserID1(int userID1) {
        this.userID1 = userID1;
    }

    public int getUserID2() {
        return userID2;
    }

    public void setUserID2(int userID2) {
        this.userID2 = userID2;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
   
}
