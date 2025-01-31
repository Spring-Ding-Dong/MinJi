package com.springDingDong.minji.assignment1;

public class Latte implements Coffee {
    private Integer shot;

    public Latte(Integer shot) {
        this.shot=shot;
    }

    @Override
    public void makeCoffee() {
        System.out.println(shot+"샷 라떼 완성");
    }

    @Override
    public Integer getShot(){
        return shot;
    }

    @Override
    public void setShot(Integer shot) {
        this.shot=shot;
    }

    @Override
    public void initShot(){
        System.out.println("기본 " +shot+"샷 임");
    }
}
