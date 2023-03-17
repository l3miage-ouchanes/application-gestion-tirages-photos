package fr.uga.l3miage.photonum.data.domain;

import java.util.Set;

import jakarta.persistence.Entity;

@Entity
public class Calendrier extends Impression {
    
    // 12 pages exactement
    private Set<Page> pages;
    

    public Set<Page> getPages() {
        return pages;
    }

    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

    
}
