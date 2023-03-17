package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Photo")
public class Photo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "texteDescription")
    private String _texteDescription;

    @Column(name ="parametres")
    private String parametres;

    @ManyToOne
    private Set<Image> image;

    public Set<Image> getImage() {
        return image;
    }

    public void setImage(Set<Image> image) {
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
