package com.praveen.blog.services;

import java.util.List;

import com.praveen.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer category);;
	//delete
	public void deleteCategory(Integer categoryId);
	//get
	public CategoryDto getCategory(Integer categoryId);
	//getall
	public List<CategoryDto> getCategories();

}
