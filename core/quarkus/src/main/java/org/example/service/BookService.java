package org.example.service;

import org.example.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();
    public Book findById(final long id);
    public Book save(final Book book);
    public Book update(final Book book);
    public void deleteById(final long id);
}
