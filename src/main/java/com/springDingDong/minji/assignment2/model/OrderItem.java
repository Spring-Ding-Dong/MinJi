package com.springDingDong.minji.assignment2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private CoffeeOrder order;  // 어떤 주문에 속해 있는지

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coffee_id")
    private Coffee coffee;  // 주문한 커피 종류

    private int quantity;  // 커피 수량

    public OrderItem(CoffeeOrder order, Coffee coffee, int quantity) {
        this.order = order;
        this.coffee = coffee;
        this.quantity = quantity;
    }
}
