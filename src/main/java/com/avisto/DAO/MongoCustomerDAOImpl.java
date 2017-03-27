package com.avisto.DAO;

import com.avisto.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by renuka on 21/03/2017.
 */

@Repository
@Qualifier("mongoDB")
public  class MongoCustomerDAOImpl implements CustomerDAO {
   private MongoDAO repository;

    @Autowired
    public MongoCustomerDAOImpl(MongoDAO repository){
        this.repository=repository;
    }


    @Override
    public Collection<Customer> getAllCust() {
        List<Customer> customers = new ArrayList<>();
        repository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        return repository.findById(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return repository.findByname(name);
    }

    @Override
    public void removeCustomerById(int id) {
    repository.delete(String.valueOf(id));
    }

    @Override
    public void updateCustomer(Customer cust) {

    }

    @Override
    public void insertCustomer(Customer cust) {

    }
}