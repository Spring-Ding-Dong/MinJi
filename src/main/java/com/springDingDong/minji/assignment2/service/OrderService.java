package com.springDingDong.minji.assignment2.service;


import com.springDingDong.minji.assignment2.dto.OrderItemDTO;
import com.springDingDong.minji.assignment2.dto.OrderRequestDTO;
import com.springDingDong.minji.assignment2.dto.OrderResponseDTO;
import com.springDingDong.minji.assignment2.exception.CustomerOrderNotFoundException;
import com.springDingDong.minji.assignment2.model.Coffee;
import com.springDingDong.minji.assignment2.model.CoffeeOrder;
import com.springDingDong.minji.assignment2.model.OrderItem;
import com.springDingDong.minji.assignment2.repository.CoffeeRepository;
import com.springDingDong.minji.assignment2.repository.OrderItemRepository;
import com.springDingDong.minji.assignment2.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final CoffeeRepository coffeeRepository;

    // 주문 생성
    @Transactional
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO) {
        // 주문
        CoffeeOrder order = new CoffeeOrder(orderRequestDTO.getCustomerName());
        orderRepository.save(order);

        // 주문에 들어갈 커피
        List<OrderItem> orderItems = orderRequestDTO.getOrderItems().stream().map(orderItemDTO->{
            //커피
            Coffee coffee = new Coffee(orderItemDTO.getCoffeeName(), orderItemDTO.getShot(), orderItemDTO.getSize(), orderItemDTO.isIce());
            //OrderItem 생성해서 저장
            OrderItem orderItem = new OrderItem(order, coffee, orderItemDTO.getQuantity());
            return orderItemRepository.save(orderItem);
        }).collect(Collectors.toList());

        order.setOrderItems(orderItems);

        // responseDTO로 변환
        List<OrderItemDTO> orderItemDTOS = order.getOrderItems().stream().map(orderItem -> {
            Coffee coffee = orderItem.getCoffee();
            OrderItemDTO orderItemDTO = new OrderItemDTO();
            orderItemDTO.setQuantity(orderItem.getQuantity());
            orderItemDTO.setCoffeeName(coffee.getName());
            return orderItemDTO;
        }).collect(Collectors.toList());

        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setCustomerName(order.getCustomerName());
        orderResponseDTO.setOrderItems(orderItemDTOS);
        return orderResponseDTO;
    }

    // 주문 삭제
    public String cancelOrder(String customerName) {
        CoffeeOrder order = orderRepository.findByCustomerName(customerName)
                .orElseThrow(() -> new CustomerOrderNotFoundException());
        orderRepository.delete(order);

        return customerName+"의 주문이 취소되었습니다.";
    }

    // 커피 주문 수량 수정
    public String updateOrder(String customerName, String coffeeName, int quantity){
        CoffeeOrder order = orderRepository.findByCustomerName(customerName)
                .orElseThrow(() -> new CustomerOrderNotFoundException());
        OrderItem orderItem = order.getOrderItems().stream()
                .filter(item -> item.getCoffee().getName().equals(coffeeName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 커피가 주문에 포함되지 않았습니다: " + coffeeName));
        orderItem.setQuantity(quantity);
        orderItemRepository.save(orderItem);

        return customerName+"의 주문 건 중 "+coffeeName+"의 수량이 "+quantity+"로 변경되었습니다.";
    }


}
