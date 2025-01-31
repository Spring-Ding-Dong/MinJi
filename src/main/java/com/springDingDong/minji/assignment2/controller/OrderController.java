package com.springDingDong.minji.assignment2.controller;

import com.springDingDong.minji.assignment2.dto .OrderItemDTO;
import com.springDingDong.minji.assignment2.dto.OrderRequestDTO;
import com.springDingDong.minji.assignment2.dto.OrderResponseDTO;
import com.springDingDong.minji.assignment2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("")
    public OrderResponseDTO createOrder(@RequestBody OrderRequestDTO requestDTO) {
        return orderService.createOrder(requestDTO);
    }

    @PatchMapping("/{customerName}")
    public String updateOrder(@PathVariable String customerName, @RequestParam String coffeeName, @RequestParam int quantity) {
        return orderService.updateOrder(customerName,coffeeName,quantity);
    }

    @DeleteMapping("/{customerName}")
    public String deleteOrder(@PathVariable String customerName) {
        return orderService.cancelOrder(customerName);
    }
}
