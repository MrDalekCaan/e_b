package com.x.shop.entity;

public class Discount {
	private String did;
	private String coupon;
	private double discount_price;
	private double floor;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public double getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(double discount_price) {
		this.discount_price = discount_price;
	}
	public double getFloor() {
		return floor;
	}
	public void setFloor(double floor) {
		this.floor = floor;
	}
	
	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Discount(String did, String coupon, double discount_price, double floor) {
		super();
		this.did = did;
		this.coupon = coupon;
		this.discount_price = discount_price;
		this.floor = floor;
	}
	
	@Override
	public String toString() {
		return "Discount [did=" + did + ", coupon=" + coupon + ", discount_price=" + discount_price + ", floor=" + floor
				+ "]";
	}	
	
}
