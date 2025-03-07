package com.blogwebsite.blog.service;

import java.util.List;

import com.blogwebsite.blog.proxy.BlogProxy;

public interface BlogService {
	//crud on blog
	
	//create blog
	public String createBlog(BlogProxy blogproxy); //user
	
	//delete blog
	public String deleteBlog(Integer id);
	
	//update blog
	public String updateBlog(BlogProxy blogProxy,Integer id);

	public List<BlogProxy> searchByBlogTitle(String title);
	
	//get all blogs
	public List<BlogProxy> getAllBlogs();
	
}
