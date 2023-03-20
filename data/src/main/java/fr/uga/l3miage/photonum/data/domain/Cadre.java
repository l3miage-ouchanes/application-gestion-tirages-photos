package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

@Entity
public class Cadre extends Impression {
    @OneToOne
    private Page page;


    public Page getPage() {
        return page;
    }
    
    public void setPage(Page page) {
        this.page = page;
    }

    
}

