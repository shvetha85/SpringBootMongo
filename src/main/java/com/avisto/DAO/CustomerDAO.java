package com.avisto.DAO;

import com.avisto.Entity.Customer;

import java.util.Collection;

/**
 * Created by renuka on 21/03/2017.
 */
public interface CustomerDAO {

    Collection<Customer> getAllCust();

    Customer getCustomerById(int id);

    Customer getCustomerByName(String name);

    void removeCustomerById(int id);

    void updateCustomer(Customer cust);

    void insertCustomer(Customer cust);


}
