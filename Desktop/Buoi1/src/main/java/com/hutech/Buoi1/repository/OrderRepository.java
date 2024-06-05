package com.hutech.Buoi1.repository;

import com.hutech.Buoi1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
