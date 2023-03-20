package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private int id;

    private double prix;
    private int quantite;
    private String format;
    private String qualité;

    @OneToOne
    private Impression impression;

    @ManyToOne
    private Reference reference;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Impression getImpression() {
        return impression;
    }

    public void setImpression(Impression impression) {
        this.impression = impression;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getQualité() {
        return qualité;
    }

    public void setQualité(String qualité) {
        this.qualité = qualité;
    }

    
}
