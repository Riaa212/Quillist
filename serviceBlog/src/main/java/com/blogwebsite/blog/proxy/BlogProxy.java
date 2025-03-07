package com.blogwebsite.blog.proxy;

import com.blogwebsite.blog.domain.BlogEntity;
import com.blogwebsite.blog.enumeration.BlogStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogProxy {

	private String title;
	private String content;
	
	private BlogStatus blogstatus;
}
