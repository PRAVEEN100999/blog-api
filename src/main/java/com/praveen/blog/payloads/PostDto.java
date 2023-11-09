package com.praveen.blog.payloads;

import java.util.Date;

import com.praveen.blog.entities.Category;
import com.praveen.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
		
	private Integer id;
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private UserDto user;
	
	private CategoryDto category;
	
}
