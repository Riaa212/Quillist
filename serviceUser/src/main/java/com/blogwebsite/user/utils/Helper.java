package com.blogwebsite.user.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blogwebsite.user.domain.UserEntity;
import com.blogwebsite.user.proxy.UserProxy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Helper {

	@Autowired
	private ObjectMapper mapper;
	
	public UserEntity convertUserProxyToEntity(UserProxy userproxy)
	{
	return mapper.convertValue(userproxy, UserEntity.class);	
	}
	
	public UserProxy convertUserEntityToProxy(UserEntity userEntity)
	{
	return mapper.convertValue(userEntity, UserProxy.class);	
	}
	
	public List<UserEntity> convertUserListProxyToEntity(List<UserProxy> userProxy)
	{
	return userProxy.stream().map(a->mapper.convertValue(a, UserEntity.class)).toList();	
	}
	
	public List<UserProxy> convertUserListEntityToProxy(List<UserEntity> userEntitylst)
	{
		return userEntitylst.stream().map(a->mapper.convertValue(a, UserProxy.class)).toList();
	}
	
	
}
