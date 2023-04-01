package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String email; // c'est le mail qui identifie un client (mail unique)

    private String prenoms;
    private String noms;
    private String mdp;

    @ManyToMany
    private List<Adresse> adresses;

    @OneToMany(mappedBy = "possesseur")
    private List<Image> imagesPossedees;

    @OneToMany
    private List<Impression> impressions;


    public List<Image> getImagesPossedees() {
        return imagesPossedees;
    }

    public void setImagesPossedees(List<Image> imagesPossedees) {
        this.imagesPossedees = imagesPossedees;
    }

    public List<Impression> getImpressions() {
        return impressions;
    }

    public void setImpressions(List<Impression> impressions) {
        this.impressions = impressions;
    }

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}