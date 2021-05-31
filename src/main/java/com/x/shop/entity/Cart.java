package com.x.shop.entity;

public class Cart {
	private String gid;
	private String uid;
	private String pid;
	private int number;
	
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
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
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cart(String gid, String uid, String pid, int number) {
		super();
		this.gid = gid;
		this.uid = uid;
		this.pid = pid;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Cart [gid=" + gid + ", uid=" + uid + ", pid=" + pid + ", number=" + number + "]";
	}
	
}
