package fr.uga.l3miage.photonum.impression;

import fr.uga.l3miage.photonum.data.domain.Client;
import jakarta.validation.constraints.NotBlank;

public record ImpressionDTO(
    @NotBlank Client proprietaire


) {
}
