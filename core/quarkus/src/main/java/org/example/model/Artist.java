package org.example.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_artists")
public class Artist extends PanacheEntity {

    @Column(name = "name", length = 50, nullable = false)
    public String name;

    @Column(name = "bio", length = 3000, nullable = false)
    public String bio;

    @Column(name = "created_date", nullable = false)
    public Instant createdDate = Instant.now();
}
