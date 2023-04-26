package org.example.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_customers")
public class Customer extends PanacheEntity {

  @Column(name = "first_name", length = 50, nullable = false)
  public String firstName;

  @Column(name = "last_name", length = 50, nullable = false)
  public String lastName;

  @Column(name = "e_mail", nullable = false)
  public String email;

  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();

}
