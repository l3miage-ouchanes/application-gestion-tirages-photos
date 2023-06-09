package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ContenuTirage {
    @Id
    @GeneratedValue
    private Long id;

    private int quantitePhoto;

    @OneToOne
    private Photo photo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantitePhoto;
    }

    public void setQuantite(int quantitePhoto) {
        this.quantitePhoto = quantitePhoto;
    }

    public Photo getPhoto() {
        return photo;
    }
    
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    
}
