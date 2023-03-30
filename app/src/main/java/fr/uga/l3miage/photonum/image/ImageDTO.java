package fr.uga.l3miage.photonum.image;

import jakarta.validation.constraints.AssertTrue;

public record ImageDTO(
    @AssertTrue
    boolean estPartagee // obligatoirement true pour etre modifié
) {
}
