package com.kootam.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kootam.Repository.SaleRepository;
import com.kootam.model.Sale;

@Service
public class SaleServiceImpl implements SaleService{

	@Autowired
	SaleRepository saleRepository;
	
	

	@Override
	public List<Sale> getAllSales() {
				return saleRepository.findAll();
	}

	@Override
	public Sale saveSale(Sale sale) {
		return saleRepository.save(sale);
		
	}

	@Override
	public Sale getSaleById(int id) {
		Optional<Sale> optional=saleRepository.findById( id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("sale not found");
		}
	}

	@Override
	public void deleteSaleById(int id) {
		this.saleRepository.deleteById(id);
		
	}
	
	@Override
	public List<Sale> findSalesOnDate(Date date) {
		// TODO Auto-generated method stub
		return saleRepository.findSalesOnDate(date);
	}
	
	@Override
	public List<Sale> findSalesAfterDate(Date date) {
		// TODO Auto-generated method stub
		return saleRepository.findSalesAfterDate(date);
	}


}