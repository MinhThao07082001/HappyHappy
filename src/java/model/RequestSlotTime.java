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
public class RequestSlotTime {
    private int requestID;
    private int day;
    private String slotFrom;
    private String slotTo;

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getSlotFrom() {
        return slotFrom;
    }

    public void setSlotFrom(String slotFrom) {
        this.slotFrom = slotFrom;
    }

    public String getSlotTo() {
        return slotTo;
    }

    public void setSlotTo(String slotTo) {
        this.slotTo = slotTo;
    }

    public RequestSlotTime(int requestID, int day, String slotFrom, String slotTo) {
        this.requestID = requestID;
        this.day = day;
        this.slotFrom = slotFrom;
        this.slotTo = slotTo;
    }

    public RequestSlotTime() {
    }

    
}
