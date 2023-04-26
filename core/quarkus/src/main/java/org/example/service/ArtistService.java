package org.example.service;

import org.example.model.Artist;

import java.util.List;

public interface ArtistService {

    public List<Artist> findAll();

    public List<Artist> find(String query, String sort, Integer pageIndex, Integer pageSize);
    public Artist findById(final long id);
    public Artist save(final Artist artist);
    public Artist update(final Artist artist);
    public void deleteById(final long id);

}
