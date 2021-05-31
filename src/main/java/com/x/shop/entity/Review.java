package com.x.shop.entity;

public class Review {
    private String rid;
    private String uid;
    private String review_name;
    private String update_time;
    private String content;
    private String type;
    private String reply_to;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getReview_name() {
        return review_name;
    }

    public void setReview_name(String review_name) {
        this.review_name = review_name;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReply_to() {
        return reply_to;
    }

    public void setReply_to(String reply_to) {
        this.reply_to = reply_to;
    }

    public Review(String rid, String uid, String review_name, String update_time, String content, String type, String reply_to) {
        this.rid = rid;
        this.uid = uid;
        this.review_name = review_name;
        this.update_time = update_time;
        this.content = content;
        this.type = type;
        this.reply_to = reply_to;
    }

    public Review() {
    }

    @Override
    public String toString() {
        return "review{" +
                "rid='" + rid + '\'' +
                ", uid='" + uid + '\'' +
                ", review_name='" + review_name + '\'' +
                ", update_time='" + update_time + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", reply_to='" + reply_to + '\'' +
                '}';
    }
}
