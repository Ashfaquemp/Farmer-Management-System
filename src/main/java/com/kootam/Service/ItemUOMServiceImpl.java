package com.kootam.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kootam.Repository.ItemUOMRepository;
import com.kootam.model.ItemUOM;

@Service
public class ItemUOMServiceImpl implements ItemUOMService{

	@Autowired
	ItemUOMRepository itemUOMRepository;
	
	@Override
	public List<ItemUOM> getAllItemUOM() {
		return itemUOMRepository.findAll();
	}

	@Override
	public void saveItemUOM(ItemUOM itemUOM) {
		itemUOMRepository.save(itemUOM);
		
	}

	@Override
	public ItemUOM getItemUOMById(int id) {
		
		Optional<ItemUOM> optional=itemUOMRepository.findById( id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("ItemUOM not found");
		}
	}

	@Override
	public void deleteItemUOMById(int id) {
		this.itemUOMRepository.deleteById(id);
		
	}

}