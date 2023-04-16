package org.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CD extends Item{

    @Column(name = "music_company")
    private String musicCompany;

    @Column(length = 100)
    private String genre;

    @OneToMany(mappedBy = "cd", cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Track> tracks = new ArrayList<>();

    public CD() {
    }

    public CD(String musicCompany, String genre, List<Track> tracks) {
        this.musicCompany = musicCompany;
        this.genre = genre;
        this.tracks = tracks;
    }

    public String getMusicCompany() {
        return musicCompany;
    }

    public void setMusicCompany(String musicCompany) {
        this.musicCompany = musicCompany;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        tracks.add(track);
        track.setCd(this);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
        track.setCd(null);
    }

}
