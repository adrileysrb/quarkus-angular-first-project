package org.example.model;

import org.example.util.enums.Language;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@Entity
public class Book extends Item {

  @Column(length = 15)
  public String isbn;

  @Column(name = "nb_of_pages")
  public Integer nbOfPages;

  @Column(name = "publication_date")
  public LocalDate publicationDate;

  @Column(length = 20)
  @Enumerated(EnumType.STRING)
  public Language language;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "publisher_fk")
  public Publisher publisher;

}
