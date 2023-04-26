package org.example.service.impl;

import org.example.model.Artist;
import org.example.model.Publisher;
import org.example.repository.PublisherRepository;
import org.example.service.PublisherService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Inject
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll().list();
    }

    @Override
    public Publisher findById(long id) {
        return publisherRepository.findById(id);
    }

    @Override
    public Publisher save(Publisher publisher) {
        return null;
    }

    @Override
    public Publisher update(Publisher publisher) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
