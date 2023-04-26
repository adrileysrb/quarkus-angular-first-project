package org.example.service;

import org.example.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public Customer findById(final long id);
    public Customer save(final Customer customer);
    public Customer update(final Customer customer);
    public void deleteById(final long id);
}
