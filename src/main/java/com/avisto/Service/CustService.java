package com.avisto.Service;

import com.avisto.DAO.CustomerDAO;
import com.avisto.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by renuka on 21/03/2017.=
 */

@Service
public class CustService implements CustomerDAO{

@Autowired
@Qualifier("fakeData")
//@Qualifier("mongoDB")
private CustomerDAO custDao;

    @Override
    public Collection<Customer> getAllCust(){
      return  this.custDao.getAllCust();
    }

    @Override
    public Customer getCustomerById(int id){
        return this.custDao.getCustomerById(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return this.custDao.getCustomerByName(name);
    }

    @Override
    public void removeCustomerById(int id) {
        this.custDao.removeCustomerById(id);
    }


    @Override
    public void updateCustomer(Customer cust) {
        this.custDao.updateCustomer(cust);
    }

    @Override
    public void insertCustomer(Customer cust) {
        this.custDao.insertCustomer(cust);
    }
}
