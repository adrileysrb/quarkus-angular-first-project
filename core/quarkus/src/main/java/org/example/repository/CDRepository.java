package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.example.model.CD;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CDRepository  implements PanacheRepository<CD> {
}
