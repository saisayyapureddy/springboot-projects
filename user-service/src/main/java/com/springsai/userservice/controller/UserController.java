package com.springsai.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsai.userservice.UserService.UserService;
import com.springsai.userservice.entity.User;
import com.springsai.userservice.wrapperObject.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		log.info("inside saveUser from UserController" + user);
		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}
	
	/*
	 * @GetMapping("/{id}") public ResponseEntity<User> getUser(@PathVariable("id")
	 * long userId) { User user = userService.getUser(userId); return new
	 * ResponseEntity<User>(user, HttpStatus.OK); }
	 */

	@GetMapping("/{id}")
	public ResponseEntity<ResponseTemplate>getUserWithDepartment(@PathVariable("id") Long userId)
	{
		log.info("inside getUserWithDepartment from UserController" + userId);
		ResponseTemplate responseTemplate = userService.getUserWithDepartment(userId);
		return new ResponseEntity<ResponseTemplate>(responseTemplate, HttpStatus.OK);
	}
	
}

