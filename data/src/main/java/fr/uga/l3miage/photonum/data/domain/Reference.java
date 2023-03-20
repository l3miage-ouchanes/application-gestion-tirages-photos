package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Entity;

@Entity
public class Reference {
    private CodeReference codeReference;
    private TypeImpression typeImpression;
    private int prix;


    public CodeReference getCodeReference() {
        return codeReference;
    }

    public void setCodeReference(CodeReference codeReference) {
        this.codeReference = codeReference;
    }

    public TypeImpression getTypeImpression() {
        return typeImpression;
    }

    public void setTypeImpression(TypeImpression typeImpression) {
        this.typeImpression = typeImpression;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    
}
