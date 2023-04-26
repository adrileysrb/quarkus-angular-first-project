package org.example.service.impl;

import org.example.model.Customer;
import org.example.service.CustomerService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
