package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

@Entity
public class Cadre extends Impression {
    private Integer taille;
    private String qualite;
    private Page page;


    public Integer getTaille() {
        return taille;
    }
    public void setTaille(Integer taille) {
        this.taille = taille;
    }
    public String getQualite() {
        return qualite;
    }
    public void setQualite(String qualite) {
        this.qualite = qualite;
    }
    public Page getPage() {
        return page;
    }
    public void setPage(Page page) {
        this.page = page;
    }

    
}

