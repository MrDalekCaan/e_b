package com.x.shop.entity;

public class Complaint {
    private String tid;
    private String uid;
    private String subject;
    private String content;
    private String date;
    private String email;
    private String complaint;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Complaint(String tid, String uid, String subject, String content, String date, String email, String complaint) {
        this.tid = tid;
        this.uid = uid;
        this.subject = subject;
        this.content = content;
        this.date = date;
        this.email = email;
        this.complaint = complaint;
    }

    @Override
    public String toString() {
        return "complaint{" +
                "tid='" + tid + '\'' +
                ", uid='" + uid + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", complaint='" + complaint + '\'' +
                '}';
    }
}
