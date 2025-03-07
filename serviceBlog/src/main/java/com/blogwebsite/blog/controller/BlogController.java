package com.blogwebsite.blog.controller;

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

import com.blogwebsite.blog.proxy.BlogProxy;
import com.blogwebsite.blog.service.impl.BlogServiceImpl;

@RestController
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogServiceImpl blogImpl;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveBlog(@RequestBody BlogProxy blogProxy)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(blogImpl.createBlog(blogProxy));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBlog(@PathVariable("id") Integer id)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(blogImpl.deleteBlog(id));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateBlog(@RequestBody BlogProxy blogProxy,@PathVariable Integer id)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(blogImpl.updateBlog(blogProxy, id));
	}
	
	@GetMapping("/searchBlogByTitle/{title}")
	public ResponseEntity<?> searchBlogByTitle(@PathVariable("title") String title)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(blogImpl.searchByBlogTitle(title));
	}
	
	@GetMapping("/getAllBlogs")
	public ResponseEntity<?> getAllBlog()
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(blogImpl.getAllBlogs());
	}
}
