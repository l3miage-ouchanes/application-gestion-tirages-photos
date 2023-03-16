package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Image {
    private Integer Id;
    private String chemin;
    private Integer resolution;
    private boolean estPartagee;
    private InformationPriseDeVue informationPriseDeVue;
    private Set<Photo> photos;

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public InformationPriseDeVue getInformationPriseDeVue() {
        return informationPriseDeVue;
    }

    public void setInformationPriseDeVue(InformationPriseDeVue informationPriseDeVue) {
        this.informationPriseDeVue = informationPriseDeVue;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean estPartagee() {
        return estPartagee;
    }

    public void setEstPartagee(boolean estPartagee) {
        this.estPartagee = estPartagee;
    }
}
