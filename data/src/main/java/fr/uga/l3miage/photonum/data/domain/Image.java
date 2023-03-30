package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Image {
   // @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
   // private Long idImage;

    @Id
    @GeneratedValue
    private Long id;

    private String chemin;

    private String resolution;
    private boolean estPartagee;
    private Date dateCreation;
    private double taille;
    private String format;

    @OneToMany(mappedBy = "image")
    private List<Photo> photos;

    @ManyToOne
    private Client possesseur;

    
    public List<Photo> getPhotos() {
        return photos;
    }



    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }



    public Client getPossesseur() {
        return possesseur;
    }



    public void setPossesseur(Client possesseur) {
        this.possesseur = possesseur;
    }



    public String getChemin() {
        return chemin;
    }

    

    public boolean isEstPartagee() {
        return estPartagee;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean estPartagee() {
        return estPartagee;
    }

    public void setEstPartagee(boolean estPartagee) {
        this.estPartagee = estPartagee;
    }

    

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }


}
