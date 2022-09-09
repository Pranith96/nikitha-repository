package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/save")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		String response = service.addUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get-all")
	public ResponseEntity<List<User>> getAllUser() {
		List<User> response = service.getUsers();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId") Integer userId) {
		User response = service.getUserData(userId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/get/id")
	public ResponseEntity<User> getUserById(@RequestParam("userId") Integer userId) {
		User response = service.getUserData(userId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
