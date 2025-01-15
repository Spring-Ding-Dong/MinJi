package com.springDingDong.minji.assignment1;

public interface Coffee {
    // 상수
    Integer MAX_SHOT = 5;

    // 추상메소드
    void makeCoffee();
    Integer getShot();
    void setShot(Integer shot);

    // default
    default void initShot(){
        System.out.println("기본 투샷임");
    }

    // static
    static void printShot(Coffee coffee){
        System.out.println("지금 "+coffee.getShot()+"샷 ~~");
    }

    static void addShot(Coffee coffee){
        Integer nowShot = coffee.getShot();
        if (nowShot<MAX_SHOT){
            coffee.setShot(nowShot+1);
            System.out.println("샷 추가됨");
            return;
        }
        System.out.println("최대 5샷임여");
        coffee.setShot(MAX_SHOT);
    }

}
