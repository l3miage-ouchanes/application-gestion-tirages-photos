package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.Set;
import java.util.List;

@Entity
public class Image {
    @Id
    private String chemin;

    private int resolution;
    private boolean estPartagee;
    private InformationPriseDeVue informationPriseDeVue;

    @OneToMany
    private Set<Photo> photos;

    @ManyToMany
    private List<Client> clients;

    @ManyToOne
    private Client possesseur;
    

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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Client getPossesseur() {
        return possesseur;
    }

    public void setPossesseur(Client possesseur) {
        this.possesseur = possesseur;
    }
}
