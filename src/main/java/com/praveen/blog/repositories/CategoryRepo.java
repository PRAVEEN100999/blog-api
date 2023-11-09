package com.praveen.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
