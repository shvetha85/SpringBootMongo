package com.avisto;

import com.avisto.DAO.MongoDAO;
import com.avisto.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by renuka on 21/03/2017.
 */

@SpringBootApplication
public class Main  implements CommandLineRunner{


    @Autowired
    MongoDAO repo;

    public static void main(String args[]) {

        SpringApplication.run(Main.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();
            repo.save(new Customer(1, "kittu", "kolu"));
            repo.save(new Customer(2, "somu", "kol34"));
            repo.save(new Customer(3, "kipot", "kol09"));
            repo.save(new Customer(4, "kittulo", "kolu64"));
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repo.findAll()) {
            System.out.println(customer);
        }

        System.out.println("--------------------------------");
        System.out.println(repo.findById(1));

    }
}
