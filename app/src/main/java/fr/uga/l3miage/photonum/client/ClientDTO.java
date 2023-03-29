package fr.uga.l3miage.photonum.client;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.domain.Impression;
import jakarta.validation.constraints.NotBlank;

public record ClientDTO(
        Long id,

        @NotBlank String email, // c'est le mail qui identifie un client (mail unique)

        List<String> prenoms,
        List<String> noms,
        String mdp,

        List<Adresse> adresses,

        List<Image> imagesPossedees,

        List<Impression> impressions) {
}

/*
 * package fr.uga.l3miage.library.authors;
 * 
 * import jakarta.validation.constraints.NotBlank;
 * 
 * public record AuthorDTO(
 * Long id,
 * 
 * @NotBlank(message = "full name of the author is mandatory")
 * String fullName
 * ) {
 * }
 */