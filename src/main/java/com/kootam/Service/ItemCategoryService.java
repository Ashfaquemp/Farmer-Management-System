package com.kootam.Service;

import java.util.List;

import com.kootam.model.ItemCategory;

public interface ItemCategoryService {
	List<ItemCategory> getAllItemCategory();
	void saveItemCategory(ItemCategory itemCategory);
	ItemCategory getItemCategoryById(int id);
	void deleteItemCategoryById(int id);
	
}

