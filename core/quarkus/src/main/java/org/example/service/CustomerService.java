package org.example.service;

import org.example.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public Customer findById(final Integer id);
    public Customer save(final Customer employee);
    public Customer update(final Customer employee);
    public void deleteById(final Integer id);
}
