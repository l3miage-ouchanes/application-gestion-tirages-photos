package fr.uga.l3miage.photonum.commande;

import java.util.Date;
import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Article;
import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CommandeDTO(
    @NotBlank Date date,
    
    @AssertFalse Boolean estValidee,

    @Size.List({
        @Size(min = 1, message = "La commande doit contenir au moins un article"),
    })
    List<Article> articles
)
{}
