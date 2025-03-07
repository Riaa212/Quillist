package com.blogwebsite.user.service;

import java.util.List;

import com.blogwebsite.user.proxy.BlogProxy;
import com.blogwebsite.user.proxy.UserProxy;

public interface UserService {

	//register user	
	public String registerUser(UserProxy user);
	
	//delete user
	public String deleteUser(Integer id);
	
	//add user
	
	//create blog
	public String createBlog(BlogProxy blog);

	//delete blog
	public String deleteBlog(BlogProxy blog);
	
	//update blog
	public String updateBlog(BlogProxy blog);
	
	//find all user
	public List<UserProxy> getAllUser();
	
	//find user by username
	public UserProxy getUserByUserName(String userName);
	
	//search blog
	public BlogProxy searchBlogByTitle(String title);
	
	public UserProxy updateUserById(Integer id,UserProxy user);
}
