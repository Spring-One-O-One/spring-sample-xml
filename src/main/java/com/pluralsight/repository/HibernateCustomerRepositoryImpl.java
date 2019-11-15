
package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

//    public void setDbUsername(String dbUsername) {
//        this.dbUsername = dbUsername;
//    }

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Billy Ruben");
        customer.setLastName("Mallett");

        customers.add(customer);

        return customers;
    }

}