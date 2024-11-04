package com.pranav.practice;

public class Mobile {
    private String mobileName;
    private int price;
    private int ram;

    public Mobile(String mobileName,int price,int ram){
        this.mobileName=mobileName;
        this.price=price;
        this.ram=ram;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString(){
        return mobileName+" "+price+" "+ram;
    }
}
