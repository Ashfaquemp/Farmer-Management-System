package com.kootam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kootam.model.ItemUOM;

@Repository
public interface ItemUOMRepository extends JpaRepository<ItemUOM, Integer> {

}