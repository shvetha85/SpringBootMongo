package com.avisto.DAO;

import com.avisto.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;

/**
 * Created by renuka on 21/03/2017.
 */
public interface MongoDAO extends MongoRepository<Customer,String>{

    public Customer findById(int id);

    public Customer findByname(String name);
}
