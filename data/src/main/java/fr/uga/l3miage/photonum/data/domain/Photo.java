package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Photo {
    private Integer id;
    private String _texteDescription;
    private String parametres;
    private Set<Image> images;

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
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
