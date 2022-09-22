package com.joaomarcelogerenutti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelogerenutti.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
