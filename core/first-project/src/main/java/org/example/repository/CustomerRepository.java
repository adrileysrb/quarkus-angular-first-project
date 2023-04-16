package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.example.model.Customer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository  implements PanacheRepository<Customer> {
}
