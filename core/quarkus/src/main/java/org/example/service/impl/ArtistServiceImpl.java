package org.example.service.impl;

import io.quarkus.panache.common.Sort;
import org.example.model.Artist;
import org.example.repository.ArtistRepository;
import org.example.service.ArtistService;
import org.jboss.resteasy.annotations.Query;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.util.List;

@ApplicationScoped
@Transactional
public class ArtistServiceImpl implements ArtistService {

    @Inject
    private ArtistRepository artistRepository;

    @Override
    public List<Artist> findAll() {
        return artistRepository.findAll().list();
    }

    @Override
    public List<Artist> find(
           String query,
           String sort,
           Integer pageIndex,
           Integer pageSize
    ){
        return artistRepository.find(query, Sort.by(sort)).page(pageIndex, pageSize).list();
    }

    @Override
    public Artist findById(long id) {
        return artistRepository.findById(id);
    }

    @Override
    public Artist save(Artist artist) {
        return null;
    }

    @Override
    public Artist update(Artist artist) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        artistRepository.deleteById(id);
    }
}
