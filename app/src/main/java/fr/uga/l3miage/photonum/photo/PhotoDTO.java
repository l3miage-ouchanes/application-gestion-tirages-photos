package fr.uga.l3miage.photonum.photo;

import fr.uga.l3miage.photonum.data.domain.Image;
import jakarta.validation.constraints.NotBlank;

public record PhotoDTO(
    @NotBlank
    Image image,
    String texteDescription,
    String parametres
){
}
