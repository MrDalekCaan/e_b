package com.x.shop.entity;

public class Category {
	private String cid;
	private int level;
	private String c;
	private String pcid;
	public String getCid() {
		return cid;
	}
	
	public void setCid(String cid) {
		this.cid = cid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getPcid() {
		return pcid;
	}
	public void setPcid(String pcid) {
		this.pcid = pcid;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String cid, int level, String c, String pcid) {
		super();
		this.cid = cid;
		this.level = level;
		this.c = c;
		this.pcid = pcid;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", level=" + level + ", c=" + c + ", pcid=" + pcid + "]";
	}
	
}
