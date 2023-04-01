package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 3)
public class Impression {
   @Id
   @GeneratedValue
    private int id;

    private String proprietaire;

    
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


}
