package com.kootam.Service;

import java.util.List;

import com.kootam.model.ItemUOM;

public interface ItemUOMService {
	List<ItemUOM> getAllItemUOM();
	void saveItemUOM(ItemUOM itemUOM);
	ItemUOM getItemUOMById(int id);
	void deleteItemUOMById(int id);
	
}

