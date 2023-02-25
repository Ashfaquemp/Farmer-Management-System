package com.kootam.Service;

import java.util.Date;
import java.util.List;

import com.kootam.model.Stock;

public interface StockService {
	List<Stock> getAllStocks();
	Stock saveStock(Stock stock);
	Stock getStockById(int id);
	void deleteStockById(int id);

	List<Stock> findStocksOnDate(Date date );
	List<Stock> findStocksAfterDate(Date date );
	
}
