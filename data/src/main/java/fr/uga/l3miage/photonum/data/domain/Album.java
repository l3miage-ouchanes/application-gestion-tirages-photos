package fr.uga.l3miage.photonum.data.domain;

import java.util.Set;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Album extends Impression {
    private String format;
    private String qualite;

    @OneToOne
    private Couverture couverture;

    @OneToMany
    private Set<Page> pages;

    
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getQualite() {
        return qualite;
    }
    public void setQualite(String qualite) {
        this.qualite = qualite;
    }
    public Couverture getCouverture() {
        return couverture;
    }
    public void setCouverture(Couverture couverture) {
        this.couverture = couverture;
    }
    public Set<Page> getPages() {
        return pages;
    }
    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

    
}
