package com.springDingDong.minji.assignment1;

public class Americano implements Coffee {
    private Integer shot;

    public Americano(){
        shot=2;
    }

    @Override
    public void makeCoffee() {
        System.out.println(shot+ "샷 아메리카노 완성");
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
    public void initShot() {
        Coffee.super.initShot();
    }
}
