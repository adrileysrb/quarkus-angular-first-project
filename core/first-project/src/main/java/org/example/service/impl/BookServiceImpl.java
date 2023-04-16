package org.example.service.impl;

import org.example.model.Book;
import org.example.service.BookService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(Integer id) {
        return null;
    }

    @Override
    public Book save(Book employee) {
        return null;
    }

    @Override
    public Book update(Book employee) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
