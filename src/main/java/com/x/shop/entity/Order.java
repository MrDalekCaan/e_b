package com.x.shop.entity;

public class Order {
    private String oid;
    private String uid;
    private String aid;
    private Double subtotal;
    private Double shipping;
    private String coupon;
    private Double total;
    private Double payable_total;
    private String order_node;
    private String payment_method;
    private String start_time;
    private String close_time;
    private String status;

    public Order() {}

    public Order(String oid, String uid, String aid, Double subtotal, Double shipping, String coupon, Double total, Double payable_total, String order_node, String payment_method, String start_time, String close_time, String status) {
        this.oid = oid;
        this.uid = uid;
        this.aid = aid;
        this.subtotal = subtotal;
        this.shipping = shipping;
        this.coupon = coupon;
        this.total = total;
        this.payable_total = payable_total;
        this.order_node = order_node;
        this.payment_method = payment_method;
        this.start_time = start_time;
        this.close_time = close_time;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", uid='" + uid + '\'' +
                ", aid='" + aid + '\'' +
                ", subtotal=" + subtotal +
                ", shipping=" + shipping +
                ", coupon='" + coupon + '\'' +
                ", total=" + total +
                ", payable_total=" + payable_total +
                ", order_node='" + order_node + '\'' +
                ", payment_method='" + payment_method + '\'' +
                ", start_time='" + start_time + '\'' +
                ", close_time='" + close_time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getShipping() {
        return shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getPayable_total() {
        return payable_total;
    }

    public void setPayable_total(Double payable_total) {
        this.payable_total = payable_total;
    }

    public String getOrder_node() {
        return order_node;
    }

    public void setOrder_node(String order_node) {
        this.order_node = order_node;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getClose_time() {
        return close_time;
    }

    public void setClose_time(String close_time) {
        this.close_time = close_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
