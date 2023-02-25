package com.kootam.Service;

import java.util.List;

import com.kootam.model.Item;

public interface ItemService {
	List<Item> getAllItems();
	void saveItem(Item item);
	Item getItemById(int id);
	void deleteItemById(int id);
	
}
