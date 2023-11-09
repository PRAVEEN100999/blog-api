package com.praveen.blog.services;

import java.util.List;

import com.praveen.blog.entities.Post;
import com.praveen.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update 
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	
	
	//getOnePost
	PostDto getPostById(Integer postId);
	
	//get all posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostByUser(Integer userId);

	//get All
	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	
}
