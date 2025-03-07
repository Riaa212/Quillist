package com.blogwebsite.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogwebsite.user.proxy.UserProxy;
import com.blogwebsite.user.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userImpl;
	
	@PostMapping("/register") //user & admin working
	public ResponseEntity<?> registerUser(@RequestBody UserProxy user)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(userImpl.registerUser(user));
	}
	
	@DeleteMapping("/deleteById/{id}") //admin working
	public ResponseEntity<?> deleteById(@PathVariable("id") Integer id)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(userImpl.deleteUser(id));
	}
	
	@GetMapping("/getAll") //admin working
	public ResponseEntity<?> getAllUser()
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(userImpl.getAllUser());
	}
	
	@GetMapping("/getByUserName/{uname}") //admin working
	public ResponseEntity<?> getUserByUserName(@PathVariable("uname") String userName)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(userImpl.getUserByUserName(userName));
	}
	
	@PutMapping("/update/{id}") //working
	public ResponseEntity<?> updateUserById(@RequestBody UserProxy user,@PathVariable("id") Integer id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userImpl.updateUserById(id, user));
	}
 }
