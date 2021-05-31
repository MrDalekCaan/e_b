package com.x.shop.entity;


public class Blog {
    private String bid;
    private String uid;
    private String title;
    private String content;
    private String cid;
    private String tag;
    private String update_time;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Blog(String bid, String uid, String title, String content, String cid, String tag, String update_time) {
        this.bid = bid;
        this.uid = uid;
        this.title = title;
        this.content = content;
        this.cid = cid;
        this.tag = tag;
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "blog{" +
                "bid='" + bid + '\'' +
                ", uid='" + uid + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", cid='" + cid + '\'' +
                ", tag='" + tag + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}

