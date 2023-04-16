package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.example.model.Artist;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArtistRepository implements PanacheRepository<Artist> {
}
