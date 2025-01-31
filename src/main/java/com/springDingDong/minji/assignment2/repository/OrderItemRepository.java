package com.springDingDong.minji.assignment2.repository;

import com.springDingDong.minji.assignment2.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
