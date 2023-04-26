package org.example.service;

import org.example.model.Artist;
import org.example.model.Publisher;

import java.util.List;

public interface PublisherService {

    public List<Publisher> findAll();
    public Publisher findById(final long id);
    public Publisher save(final Publisher publisher);
    public Publisher update(final Publisher publisher);
    public void deleteById(final long id);
}
