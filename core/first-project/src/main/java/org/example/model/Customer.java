package org.example.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate = Instant.now();

    @Column(name = "alteration_date", nullable = true)
    private Instant alterationDate;


    @Column(name = "creation_user_key", nullable = false)
    private String creationUserKey;

    @Column(name = "alteration_user_key", nullable = true)
    private String alterationUserKey;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String email, Instant createdDate, Instant alterationDate, String creationUserKey, String alterationUserKey) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                ", alterationDate=" + alterationDate +
                ", creationUserKey='" + creationUserKey + '\'' +
                ", alterationUserKey='" + alterationUserKey + '\'' +
                '}';
    }
}
