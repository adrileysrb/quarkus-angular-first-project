package org.example.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate = Instant.now();

    @Column(name = "alteration_date", nullable = true)
    private Instant alterationDate;


    @Column(name = "creation_user_key", nullable = false)
    private String creationUserKey;

    @Column(name = "alteration_user_key", nullable = true)
    private String alterationUserKey;


    public Publisher() {
    }

    public Publisher(String name, Instant createdDate, Instant alterationDate, String creationUserKey, String alterationUserKey) {
        this.name = name;
        this.createdDate = createdDate;
        this.alterationDate = alterationDate;
        this.creationUserKey = creationUserKey;
        this.alterationUserKey = alterationUserKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", createdDate=" + createdDate +
                ", alterationDate=" + alterationDate +
                ", creationUserKey='" + creationUserKey + '\'' +
                ", alterationUserKey='" + alterationUserKey + '\'' +
                '}';
    }
}
