package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

@Entity
public class Couverture {
    @Id
    @GeneratedValue
    private int id;

    private String titre;

    @OneToOne
    private Photo photo;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    
}
