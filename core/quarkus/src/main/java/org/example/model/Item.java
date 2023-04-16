package org.example.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 3000)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "artist_fk")
    private Artist artist;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate = Instant.now();

    @Column(name = "alteration_date", nullable = true)
    private Instant alterationDate;

    @Column(name = "creation_user_key", nullable = false)
    private String creationUserKey;

    @Column(name = "alteration_user_key", nullable = true)
    private String alterationUserKey;

    public Item() {
    }

    public Item(Long id, String title, String description, BigDecimal price, Artist artist, Instant createdDate, Instant alterationDate, String creationUserKey, String alterationUserKey) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.artist = artist;
        this.createdDate = createdDate;
        this.alterationDate = alterationDate;
        this.creationUserKey = creationUserKey;
        this.alterationUserKey = alterationUserKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getAlterationDate() {
        return alterationDate;
    }

    public void setAlterationDate(Instant alterationDate) {
        this.alterationDate = alterationDate;
    }

    public String getCreationUserKey() {
        return creationUserKey;
    }

    public void setCreationUserKey(String creationUserKey) {
        this.creationUserKey = creationUserKey;
    }

    public String getAlterationUserKey() {
        return alterationUserKey;
    }

    public void setAlterationUserKey(String alterationUserKey) {
        this.alterationUserKey = alterationUserKey;
    }
}
