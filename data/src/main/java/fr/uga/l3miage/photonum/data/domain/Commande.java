package fr.uga.l3miage.photonum.data.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private double prixTotal;

    @OneToMany
    private List<Article> articles;


    public Long getId() {
        return this.id;
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


    public List<Article> getArticles() {
        return articles;
    }


    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
   
}