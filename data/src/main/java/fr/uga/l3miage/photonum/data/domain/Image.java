package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Image {
   // @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
   // private Long idImage;

    @Id
    private String chemin;

    private int resolution;
    private boolean estPartagee;
    private Date dateCreation;
    private double taille;
    private String format;

   // @OneToMany
    //private List<Photo> photos;

    ////////////////////////////////££££££££££££££££££££££££££££££££££££££££££££££££££££££££
    @ManyToOne  //(cascade = CascadeType.ALL)
   //@JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client possesseur;
    ////////////////////////////////££££££££££££££££££££££££££££££££££££££££££££££££££££££££

    public String getChemin() {
        return chemin;
    }

    

    public boolean isEstPartagee() {
        return estPartagee;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
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


}
