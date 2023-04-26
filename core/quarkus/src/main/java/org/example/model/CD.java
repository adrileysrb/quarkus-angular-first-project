package org.example.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CD extends Item {

  @Column(name = "music_company")
  public String musicCompany;

  @Column(length = 100)
  public String genre;

  @OneToMany(mappedBy = "cd", cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, orphanRemoval = true)
  @JsonbTransient
  public List<Track> tracks = new ArrayList<>();


}
