package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Entity;

@Entity
public class Reference {
    private CodeReference codeReference;
    private TypeImpression typeImpression;
    private int prix;


    public CodeReference getCodeReference() {
        return this.codeReference;
    }

    public void setCodeReference(CodeReference codeReference) {
        this.codeReference = codeReference;
    }

    public void setTypeImpression(TypeImpression typeImpression) {
        this.typeImpression = typeImpression;
    }

    public TypeImpression getTypeImpression() {
        return this.typeImpression;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

}
