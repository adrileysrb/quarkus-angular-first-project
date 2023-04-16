package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.example.model.Book;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository  implements PanacheRepository<Book> {
}
