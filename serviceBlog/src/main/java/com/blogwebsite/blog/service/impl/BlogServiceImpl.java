package com.blogwebsite.blog.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogwebsite.blog.domain.BlogEntity;
import com.blogwebsite.blog.proxy.BlogProxy;
import com.blogwebsite.blog.repository.BlogRepo;
import com.blogwebsite.blog.service.BlogService;
import com.blogwebsite.blog.utils.Helper;

@Service
public class BlogServiceImpl implements BlogService
{
	
	@Autowired
	private BlogRepo blogRepo;

	@Autowired
	private Helper helper;

	@Override
	public String createBlog(BlogProxy blogproxy) {
		BlogEntity convertBlogProxyToEntity = helper.convertBlogProxyToEntity(blogproxy);
		blogRepo.save(convertBlogProxyToEntity);
		return "saved successfully";
	}

	@Override
	public String deleteBlog(Integer id) {
		blogRepo.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public String updateBlog(BlogProxy blogProxy, Integer id) {
		Optional<BlogEntity> byId = blogRepo.findById(id);
		if(byId.isPresent())
		{
			BlogEntity blogEntity = byId.get();
			blogEntity.setTitle(blogProxy.getTitle());
			blogEntity.setContent(blogProxy.getContent());
			blogRepo.save(blogEntity);
		}
		return "updated successfully";
	}

	//search blog by title
	@Override
	public List<BlogProxy> searchByBlogTitle(String title) {
		List<BlogEntity> byTitle = blogRepo.findByTitle(title);
		return helper.convertBlogListEntityToProxy(byTitle);
	}

	@Override
	public List<BlogProxy> getAllBlogs() {
		List<BlogEntity> all = blogRepo.findAll();
		return helper.convertBlogListEntityToProxy(all);
	}
	
}
