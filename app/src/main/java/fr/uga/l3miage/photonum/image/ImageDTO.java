package fr.uga.l3miage.photonum.image;

import jakarta.validation.constraints.AssertTrue;

public record ImageDTO(
    int id,
    @AssertTrue
    boolean estPartagee // obligatoirement true pour etre modifié
) {
}
