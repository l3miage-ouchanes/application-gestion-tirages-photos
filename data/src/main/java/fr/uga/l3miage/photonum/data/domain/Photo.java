package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;


@Entity
public class Photo {
    @Id
    @GeneratedValue
    private Integer id;

    private String _texteDescription;
    private String parametres;

    @ManyToOne
    private Image image;


    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get_texteDescription() {
        return _texteDescription;
    }

    public void set_texteDescription(String _texteDescription) {
        this._texteDescription = _texteDescription;
    }

    public String getParametres() {
        return parametres;
    }

    public void setParametres(String parametres) {
        this.parametres = parametres;
    }
}
