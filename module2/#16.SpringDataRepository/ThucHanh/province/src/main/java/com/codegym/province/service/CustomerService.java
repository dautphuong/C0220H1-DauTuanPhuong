package com.codegym.province.service;

import com.codegym.model.Customer;
import com.codegym.province.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void save(Customer customer);

    void remove(Long id);
}
