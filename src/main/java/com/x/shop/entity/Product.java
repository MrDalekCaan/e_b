package com.x.shop.entity;

public class Product {
    private String pid;
    private String pname;
    private double price;
    private int inventory;
    private char cid;
    private String introduction;
    private String desc;
    private String img;
    private String addition_info;
    private int sell_count;
    private String color;
    private String discount_msg;
    private char gender;
    private char available;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public char getCid() {
        return cid;
    }

    public void setCid(char cid) {
        this.cid = cid;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddition_info() {
        return addition_info;
    }

    public void setAddition_info(String addition_info) {
        this.addition_info = addition_info;
    }

    public int getSell_count() {
        return sell_count;
    }

    public void setSell_count(int sell_count) {
        this.sell_count = sell_count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiscount_msg() {
        return discount_msg;
    }

    public void setDiscount_msg(String discount_msg) {
        this.discount_msg = discount_msg;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getAvailable() {
        return available;
    }

    public void setAvailable(char available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", cid=" + cid +
                ", introduction='" + introduction + '\'' +
                ", desc='" + desc + '\'' +
                ", img='" + img + '\'' +
                ", addition_info='" + addition_info + '\'' +
                ", sell_count=" + sell_count +
                ", color='" + color + '\'' +
                ", discount_msg='" + discount_msg + '\'' +
                ", gender=" + gender +
                ", available=" + available +
                '}';
    }
}
