package org.example.service;

import org.example.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();
    public Book findById(final Integer id);
    public Book save(final Book employee);
    public Book update(final Book employee);
    public void deleteById(final Integer id);
}
