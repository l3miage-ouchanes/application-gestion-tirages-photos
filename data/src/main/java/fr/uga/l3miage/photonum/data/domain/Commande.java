package fr.uga.l3miage.photonum.data.domain;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private int id;

    private Date date;
    private double prixTotal;
    private Set<Article> articles;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Set<Article> getArticles() {
        return articles;
    }
    
    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    
}

