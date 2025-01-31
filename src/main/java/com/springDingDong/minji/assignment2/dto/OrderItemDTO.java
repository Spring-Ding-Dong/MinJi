package com.springDingDong.minji.assignment2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderItemDTO {
    private String coffeeName;
    private int shot = 2;
    private String size = "Tall";
    private boolean ice = true;
    private int quantity =1; //기본값들 설정
}
