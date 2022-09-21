package com.joaomarcelogerenutti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelogerenutti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
