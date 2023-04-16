package org.example.service.impl;

import org.example.model.Artist;
import org.example.service.ArtistService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class ArtistServiceImpl implements ArtistService {
    @Override
    public List<Artist> findAll() {
        return null;
    }

    @Override
    public Artist findById(Integer id) {
        return null;
    }

    @Override
    public Artist save(Artist employee) {
        return null;
    }

    @Override
    public Artist update(Artist employee) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
