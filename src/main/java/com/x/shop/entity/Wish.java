package com.x.shop.entity;

public class Wish {
	private String wid;
	private String uid;
	private String pid;
	private int number;
	
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Wish() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Wish(String wid, String uid, String pid, int number) {
		super();
		this.wid = wid;
		this.uid = uid;
		this.pid = pid;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Wishlist [wid=" + wid + ", uid=" + uid + ", pid=" + pid + ", number=" + number + "]";
	}
		
}
