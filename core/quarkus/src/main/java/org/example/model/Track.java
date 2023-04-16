package org.example.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "t_tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Duration duration;

    @JoinColumn(name = "cd_fk")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonbTransient
    private CD cd;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate = Instant.now();

    private Track() {
    }

    public Track(String title, Duration duration) {
        this.title = title;
        this.duration = duration;
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

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", createdDate=" + createdDate +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return id.equals(track.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
