package fr.uga.l3miage.photonum.data.domain;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Page")
public class Page {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "miseEnForme")
    private String miseEnForme;

    @OneToMany
    private List<Photo> photos;

    
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

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

}
