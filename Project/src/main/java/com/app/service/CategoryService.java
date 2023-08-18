package com.app.service;

import com.app.entities.Category;

public interface CategoryService {
	
	Category addNewCategory(Category cat);
	
	
	String delCategory(Long CategoryId);
}

