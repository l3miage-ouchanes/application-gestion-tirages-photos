package fr.uga.l3miage.photonum.image;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;

public record ImageDTO(
    Long id,
    @AssertTrue
    @NotBlank
    boolean estPartagee // obligatoirement true pour etre modifié
) {
}
