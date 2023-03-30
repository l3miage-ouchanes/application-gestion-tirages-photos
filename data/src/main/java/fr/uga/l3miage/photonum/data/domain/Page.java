package fr.uga.l3miage.photonum.data.domain;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class Page {
    @Id
    @GeneratedValue
    private int id;

    private String miseEnForme;

    @OneToMany
    private Set<Photo> photos;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMiseEnForme() {
        return miseEnForme;
    }

    public void setMiseEnForme(String miseEnForme) {
        this.miseEnForme = miseEnForme;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    
}
