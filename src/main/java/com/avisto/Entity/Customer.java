package com.avisto.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by renuka on 21/03/2017.
 */

@Document
public class Customer {

    @Id
    private int id;
    private String name;
    private String email;

    public Customer() {
    }
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', email='%s']",
                id, name, email);
    }


}
