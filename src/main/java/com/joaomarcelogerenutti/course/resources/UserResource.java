package com.joaomarcelogerenutti.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaomarcelogerenutti.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "João", "joaomarcelogerenuttii@hotmail.com", "998262909", "123321");
		return ResponseEntity.ok().body(u);
	}
}
