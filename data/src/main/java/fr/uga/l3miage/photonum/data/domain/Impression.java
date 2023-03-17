package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;


@Entity
public abstract class Impression {
    @Id
    @GeneratedValue
    private int id; // remplacer car String si besoin
    private String proprietaire;

    @ManyToOne
    private Client client;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProprietaire() {
        return proprietaire;
    }
    
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
