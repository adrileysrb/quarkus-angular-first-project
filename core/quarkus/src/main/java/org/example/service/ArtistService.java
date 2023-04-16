package org.example.service;

import org.example.model.Artist;

import java.util.List;

public interface ArtistService {

    public List<Artist> findAll();
    public Artist findById(final Integer id);
    public Artist save(final Artist employee);
    public Artist update(final Artist employee);
    public void deleteById(final Integer id);

}
