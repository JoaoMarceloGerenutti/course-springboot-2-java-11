package com.joaomarcelogerenutti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelogerenutti.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
