package com.springDingDong.minji;

import com.springDingDong.minji.assignment1.Americano;
import com.springDingDong.minji.assignment1.Coffee;
import com.springDingDong.minji.assignment1.Latte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinjiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinjiApplication.class, args);

//		//아메리카노&라떼 생성
//		Coffee americano = new Americano();
//		Coffee latte = new Latte(1);
//
//		//아메리카노 샷 추가
//		americano.initShot();
//		Coffee.addShot(americano);
//		Coffee.printShot(americano);
//		americano.makeCoffee();
//
//		//라떼 샷 추가
//		latte.initShot();
//		Coffee.addShot(latte);
//		Coffee.addShot(latte);
//		Coffee.addShot(latte);
//		Coffee.addShot(latte);
//		Coffee.addShot(latte);
//		Coffee.printShot(latte);
//		latte.makeCoffee();


	}

}
