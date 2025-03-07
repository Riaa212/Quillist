package com.blogwebsite.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogwebsite.user.domain.UserEntity;
import com.blogwebsite.user.proxy.BlogProxy;
import com.blogwebsite.user.proxy.UserProxy;
import com.blogwebsite.user.repository.UserRepo;
import com.blogwebsite.user.service.UserService;
import com.blogwebsite.user.utils.Helper;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private Helper helper;
	
	@Override
	public String registerUser(UserProxy user) {
		userRepo.save(helper.convertUserProxyToEntity(user));
		return "register successfully";
	}

	@Override
	public String deleteUser(Integer id) {
			userRepo.deleteById(id);
		return "user deleted successfully";
	}

	@Override
	public String createBlog(BlogProxy blog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBlog(BlogProxy blog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBlog(BlogProxy blog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserProxy> getAllUser() {
		List<UserEntity> all = userRepo.findAll();
		return helper.convertUserListEntityToProxy(all);
	}

	@Override
	public UserProxy getUserByUserName(String userName) {
		UserEntity byUserName = userRepo.findByUserName(userName);
		return helper.convertUserEntityToProxy(byUserName);
	}

	@Override
	public BlogProxy searchBlogByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProxy updateUserById(Integer id, UserProxy user) {
		Optional<UserEntity> byId = userRepo.findById(id);
		
		if(byId.isPresent())
		{
			UserEntity userEntity = byId.get();
			userEntity.setUserName(user.getUserName());
			userEntity.setEmail(user.getEmail());
			userEntity.setPassword(user.getPassword());
			userRepo.save(userEntity);
		}
		return user;
	}
	
	
}
