package com.blogwebsite.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogwebsite.admin.domain.AdminEntity;
import com.blogwebsite.admin.proxy.AdminProxy;
import com.blogwebsite.admin.proxy.BlogProxy;
import com.blogwebsite.admin.proxy.UserProxy;
import com.blogwebsite.admin.repository.AdminRepo;
import com.blogwebsite.admin.service.AdminService;
import com.blogwebsite.admin.utils.Helper;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private Helper helper;
	
	@Override
	public String registerAdmin(AdminProxy admin) {
		 adminRepo.save(helper.convert(admin, AdminEntity.class));
		return "register successfully...";
	}

	@Override
	public UserProxy findAllUsers() {
		return null;
	}

	@Override
	public UserProxy getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerUser(UserProxy user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogProxy> getAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogProxy> searchByBlogTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBlog(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
