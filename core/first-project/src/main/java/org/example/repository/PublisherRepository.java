package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.example.model.Publisher;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PublisherRepository  implements PanacheRepository<Publisher> {
}
