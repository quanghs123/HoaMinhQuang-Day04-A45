package com.example.hoaminhquang_day04_45;

public class ContactDemo {
    boolean img;
    String name;
    String discribe;
    float price;

    public ContactDemo(boolean img, String name, String discribe, float price) {
        this.img = img;
        this.name = name;
        this.discribe = discribe;
        this.price = price;
    }

    public boolean isImg() {
        return img;
    }

    public void setImg(boolean img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
