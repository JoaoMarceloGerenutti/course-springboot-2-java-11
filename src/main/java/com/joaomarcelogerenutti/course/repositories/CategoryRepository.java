package com.joaomarcelogerenutti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelogerenutti.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
