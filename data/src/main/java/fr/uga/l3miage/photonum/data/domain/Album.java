package fr.uga.l3miage.photonum.data.domain;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue("ALB")
public class Album extends Impression {
    

    @OneToOne
    private Couverture couverture;

    @OneToMany
    private Set<Page> pages;

    
    
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
