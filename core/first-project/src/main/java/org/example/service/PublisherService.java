package org.example.service;

import org.example.model.Artist;
import org.example.model.Publisher;

import java.util.List;

public interface PublisherService {

    public List<Publisher> findAll();
    public Publisher findById(final Integer id);
    public Publisher save(final Artist employee);
    public Publisher update(final Artist employee);
    public void deleteById(final Integer id);
}
