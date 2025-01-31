package com.springDingDong.minji.assignment2.repository;

import com.springDingDong.minji.assignment2.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<CoffeeOrder, Long> {
    Optional<CoffeeOrder> findByCustomerName(String customerName);
}
