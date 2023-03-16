package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public abstract class Impression {

    @Id
    @GeneratedValue
    private Long id; // remplacer car String si besoin
    private String proprietaire;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    

}
