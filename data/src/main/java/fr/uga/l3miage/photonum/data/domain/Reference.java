package fr.uga.l3miage.photonum.data.domain;

public class Reference {
    private CodeReference codeReference;
    private TypeImpression typeImpression;
    private Integer prix;

    public enum CodeReference {
   
    }
    public enum TypeImpression{
        CALENDRIER,
        ALBUM,
        TIRAGE,
        CADRE
    }
}
