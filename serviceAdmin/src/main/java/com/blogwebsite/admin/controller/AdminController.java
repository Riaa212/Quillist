package com.blogwebsite.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogwebsite.admin.proxy.AdminProxy;
import com.blogwebsite.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService service;

	@PostMapping("/register") //working
	public ResponseEntity<?> registerAdmin(@RequestBody AdminProxy adminProxy)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.registerAdmin(adminProxy));
	}
}
