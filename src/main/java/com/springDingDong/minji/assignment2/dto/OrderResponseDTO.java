package com.springDingDong.minji.assignment2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class OrderResponseDTO {
    private String CustomerName;
    private List<OrderItemDTO> orderItems;

}
