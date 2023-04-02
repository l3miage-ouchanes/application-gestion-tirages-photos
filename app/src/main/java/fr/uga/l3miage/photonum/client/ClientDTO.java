package fr.uga.l3miage.photonum.client;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.domain.Impression;

public record ClientDTO(
    Long id,
    String email,
    String prenoms,
    String noms,
    String mdp,
    List<Adresse> adresses,
    List<Image> imagesPossedees,
    List<Impression> impressions
) {
}
