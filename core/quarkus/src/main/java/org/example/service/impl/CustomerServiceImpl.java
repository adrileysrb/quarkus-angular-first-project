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
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public Customer save(Customer employee) {
        return null;
    }

    @Override
    public Customer update(Customer employee) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
