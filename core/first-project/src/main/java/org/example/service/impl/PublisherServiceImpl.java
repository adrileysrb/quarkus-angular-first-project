package org.example.service.impl;

import org.example.model.Artist;
import org.example.model.Publisher;
import org.example.service.PublisherService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class PublisherServiceImpl implements PublisherService {
    @Override
    public List<Publisher> findAll() {
        return null;
    }

    @Override
    public Publisher findById(Integer id) {
        return null;
    }

    @Override
    public Publisher save(Artist employee) {
        return null;
    }

    @Override
    public Publisher update(Artist employee) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
