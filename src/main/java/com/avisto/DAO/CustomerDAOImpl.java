package com.avisto.DAO;

import com.avisto.Entity.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by renuka on 21/03/2017.
 */

@Repository
@Qualifier("fakeData")
public class CustomerDAOImpl implements CustomerDAO {

    private static Map<Integer,Customer> customers;

    static{
        customers= new HashMap<Integer,Customer>() {
            {
            put(1,new Customer(1,"axil","abc@gmail.com"));
                put(2,new Customer(2,"baxi","abcd@gmail.com"));
                put(3,new Customer(3,"caxe","abcde@gmail.com"));
                put(4,new Customer(4,"maxile","abcdef@gmail.com"));

            }
        };
    }

    public Collection<Customer> getAllCust(){
        return this.customers.values();
    }

    public Customer getCustomerById(int id){
        System.out.println("in this method"+id);
       return this.customers.get(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return this.customers.get(name);
    }

    public void removeCustomerById(int id) {
        this.customers.remove(id);
    }

    public void updateCustomer(Customer cust) {
       Customer c=customers.get(cust.getId());
       c.setEmail(cust.getEmail());
       c.setName(cust.getName());
       customers.put(cust.getId(),c);
    }

    public void insertCustomer(Customer cust){
        Customer c=new Customer();
        c.setId(cust.getId());
        c.setEmail(cust.getEmail());
        c.setName(cust.getName());
        customers.put(cust.getId(),cust);
    }
}
