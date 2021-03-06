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
public class Subject {
    private int subjectID;
    private String subjectName;
    private String level;
    private String status;
    
    public Subject() {
    }

    public Subject(int subjectID, String subjectName, String level) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.level = level;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Subject(int subjectID, String subjectName, String level, String status) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.level = level;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", subjectName=" + subjectName + ", status=" + status + '}';
    }
    
}
