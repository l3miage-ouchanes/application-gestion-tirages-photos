package fr.uga.l3miage.photonum.image;

import java.util.Date;
import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Photo;

public record ImageDTO(
    String chemin,
    double resolution,
    boolean estPartagee,
    Date dateCreation,
    double taille,
    String format,
    List<Photo> photos,
    Client possesseur
) {
}
