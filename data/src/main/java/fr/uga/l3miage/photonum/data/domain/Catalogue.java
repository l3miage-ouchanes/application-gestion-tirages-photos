package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Catalogue {
    private List<Reference> references;
    

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    
}
