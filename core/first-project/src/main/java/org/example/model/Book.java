package org.example.model;

import org.graalvm.polyglot.Language;

import javax.persistence.*;
import java.time.LocalDate;

public class Book extends Item{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 15)
    private String isbn;

    @Column(name = "nb_of_pages")
    private Integer nbOfPages;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private Language language;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "publisher_fk")
    private Publisher publisher;

    public Book() {
    }

    public Book(Long id, String isbn, Integer nbOfPages, LocalDate publicationDate, Language language, Publisher publisher) {
        this.id = id;
        this.isbn = isbn;
        this.nbOfPages = nbOfPages;
        this.publicationDate = publicationDate;
        this.language = language;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", nbOfPages=" + nbOfPages +
                ", publicationDate=" + publicationDate +
                ", language=" + language +
                ", publisher=" + publisher +
                '}';
    }
}
