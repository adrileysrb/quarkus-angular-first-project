package org.example.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "t_tracks")
public class Track extends PanacheEntity {

  @Column(nullable = false)
  public String title;

  @Column(nullable = false)
  public Duration duration;

  @JoinColumn(name = "cd_fk")
  @ManyToOne(fetch = FetchType.LAZY)
  @JsonbTransient
  public CD cd;

  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();

}
