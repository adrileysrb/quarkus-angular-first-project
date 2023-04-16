package org.example.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.time.Instant;

public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "item_fk")
    private Item item;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "purchase_order_fk")
    @JsonbTransient
    private PurchaseOrder purchaseOrder;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate = Instant.now();

    public OrderLine() {
    }

    public OrderLine(Long id, Item item, Integer quantity, PurchaseOrder purchaseOrder, Instant createdDate) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.purchaseOrder = purchaseOrder;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

}
