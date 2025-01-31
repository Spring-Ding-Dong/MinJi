package com.springDingDong.minji.assignment2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderRequestDTO {
    private String customerName;
    private List<OrderItemDTO> orderItems;
}
