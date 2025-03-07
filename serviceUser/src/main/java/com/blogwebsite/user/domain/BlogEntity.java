package com.blogwebsite.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name="blog")
public class BlogEntity {

	private Integer id;
	private String title;
	private String content;
	
	//@Enumerated(EnumType.STRING)
	//private BlogStatus blog;
}
