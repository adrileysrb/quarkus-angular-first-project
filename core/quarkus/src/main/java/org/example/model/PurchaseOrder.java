package org.example.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_purchase_orders")
public class PurchaseOrder extends PanacheEntity {

  @Column(name = "purchase_order_date", nullable = false)
  public LocalDate date = LocalDate.now();

  @OneToMany(mappedBy = "purchaseOrder", cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, orphanRemoval = true)
  @JsonbTransient
  public List<OrderLine> orderLines = new ArrayList<>();

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "customer_fk")
  public Customer customer;

  @Column(name = "created_date", nullable = false)
  public Instant createdDate = Instant.now();

}
