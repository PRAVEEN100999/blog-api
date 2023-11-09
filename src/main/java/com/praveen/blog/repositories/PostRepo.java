package com.praveen.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.blog.entities.Category;
import com.praveen.blog.entities.Post;
import com.praveen.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
