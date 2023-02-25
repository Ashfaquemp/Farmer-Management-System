package com.kootam.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kootam.Repository.ItemCategoryRepository;
import com.kootam.model.ItemCategory;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService{

	@Autowired
	ItemCategoryRepository itemCategoryRepository;
	
	@Override
	public List<ItemCategory> getAllItemCategory() {
		return itemCategoryRepository.findAll();
	}

	@Override
	public void saveItemCategory(ItemCategory itemCategory) {
		itemCategoryRepository.save(itemCategory);
		
	}

	@Override
	public ItemCategory getItemCategoryById(int id) {
		
		Optional<ItemCategory> optional=itemCategoryRepository.findById( id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("ItemCategory not found");
		}
	}

	@Override
	public void deleteItemCategoryById(int id) {
		this.itemCategoryRepository.deleteById(id);
		
	}

}
