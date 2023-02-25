package com.kootam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kootam.model.ItemCategory;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Integer> {

}