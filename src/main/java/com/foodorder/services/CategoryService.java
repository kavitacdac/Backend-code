package com.foodorder.services;

import java.util.List;

import com.foodorder.entities.Category;

public interface CategoryService {
	void save(Category cat);
	List<Category> listAll();
	Category findById(int id);
	void deleteCategory(int id);
	void updateStatus(int id,boolean status);
}
