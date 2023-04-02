package fr.uga.l3miage.photonum.commande;

import org.mapstruct.Mapper;

import fr.uga.l3miage.photonum.data.domain.Commande;

@Mapper(componentModel = "spring")
public interface CommandeMapper {
    CommandeDTO entityToDTO(Commande commande);

    Commande dtoToEntity(CommandeDTO commande);
}
