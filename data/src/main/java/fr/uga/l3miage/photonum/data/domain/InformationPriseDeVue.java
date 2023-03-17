package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "InformationPriseDeVue")
public class InformationPriseDeVue {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "dateCreation")
    private Date dateCreation;

    @Column(name = "taille")
    private Integer taille;

    @Column(name = "format")
    private String format;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
