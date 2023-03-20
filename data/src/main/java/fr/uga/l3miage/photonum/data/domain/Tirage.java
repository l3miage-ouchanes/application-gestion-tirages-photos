package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Tirage extends Impression {
      @OneToMany
      private List<ContenuTirage> contenusTirage;

      
      public List<ContenuTirage> getContenusTirage() {
            return contenusTirage;
      }

      public void setContenusTirage(List<ContenuTirage> contenusTirage) {
            this.contenusTirage = contenusTirage;
      }

      
}
