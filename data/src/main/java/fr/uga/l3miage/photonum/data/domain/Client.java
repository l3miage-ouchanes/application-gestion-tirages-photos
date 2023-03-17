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

    ////////////// jsp quoi mettre !!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private List<String> prenom;
    private List<String> nom;

    @Column(name = "mdp")
    private String mdp;

    @ManyToMany
    private Set<Adresse> adresses;


    public Set<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(Set<Adresse> adresses) {
        this.adresses = adresses;
    }

    public List<String> getPrenom() {
        return prenom;
    }

    public void setPrenom(List<String> prenom) {
        this.prenom = prenom;
    }

    public List<String> getNom() {
        return nom;
    }

    public void setNom(List<String> nom) {
        this.nom = nom;
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
}
