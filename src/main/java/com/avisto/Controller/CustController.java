package com.avisto.Controller;

import com.avisto.Entity.Customer;
import com.avisto.Service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

/**
 * Created by renuka on 21/03/2017.
 */

@RestController
@RequestMapping("/customers")
public class CustController {


    @Autowired
    private CustService custService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Customer> getAllCust() {
        return custService.getAllCust();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("id") int id) {
        return custService.getCustomerById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCustomerById(@PathVariable("id") int id) {
        custService.removeCustomerById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCustomer(@RequestBody Customer cust) {
        custService.updateCustomer(cust);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCustomer(@RequestBody Customer cust) {
        custService.insertCustomer(cust);
    }

}
