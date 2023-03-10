package com.kootam.Service;

import java.util.Date;
import java.util.List;

import com.kootam.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
	void saveCustomer(Customer customer);
	Customer getCustomerById(int id);
	void deleteCustomerById(int id);
	List<Customer> findCustomersOnDate(Date date );
	List<Customer> findCustomersAfterDate(Date date );
	
}

