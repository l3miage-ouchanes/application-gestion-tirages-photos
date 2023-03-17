package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @Column(name = "email")
    private String email; // c'est le mail qui identifie un client (mail unique)

    @Column(name = "prenoms")
    private List<String> prenoms;

    @Column(name = "noms")
    private List<String> noms;

    @Column(name = "mdp")
    private String mdp;

    @ManyToMany
    private Set<Adresse> adresses;

    @ManyToMany
    private Set<Image> imagesAccessibles;

    @OneToMany
    private Set<Image> imagesPossedees;

    public Set<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(Set<Adresse> adresses) {
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

    public Set<Image> getImagesAccessibles() {
        return imagesAccessibles;
    }

    public void setImagesAccessibles(Set<Image> imagesAccessibles) {
        this.imagesAccessibles = imagesAccessibles;
    }

    public Set<Image> getImagesPossedees() {
        return imagesPossedees;
    }

    public void setImagesPossedees(Set<Image> imagesPossedees) {
        this.imagesPossedees = imagesPossedees;
    }
}
