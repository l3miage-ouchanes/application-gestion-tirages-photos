package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    private String email; // c'est le mail qui identifie un client (mail unique)

    private List<String> prenoms;
    private List<String> noms;
    private String mdp;

    @ManyToMany
    private List<Adresse> adresses;

    @ManyToMany
    private List<Image> imagesAccessibles;

    @OneToMany
    private List<Image> imagesPossedees;

    @OneToMany
    private Set<Impression> impressions;


    public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    public List<String> getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(List<String> prenoms) {
        this.prenoms = prenoms;
    }

    public List<String> getNoms() {
        return noms;
    }

    public void setNoms(List<String> noms) {
        this.noms = noms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public List<Image> getImagesAccessibles() {
        return imagesAccessibles;
    }

    public void setImagesAccessibles(List<Image> imagesAccessibles) {
        this.imagesAccessibles = imagesAccessibles;
    }

    public List<Image> getImagesPossedees() {
        return imagesPossedees;
    }

    public void setImagesPossedees(List<Image> imagesPossedees) {
        this.imagesPossedees = imagesPossedees;
    }

    public Set<Impression> getImpressions() {
        return impressions;
    }

    public void setImpressions(Set<Impression> impressions) {
        this.impressions = impressions;
    }
}
