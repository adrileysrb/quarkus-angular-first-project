package org.example.service.impl;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.service.BookService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class BookServiceImpl implements BookService {

    @Inject
    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll().list();
    }

    @Override
    public Book findById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
