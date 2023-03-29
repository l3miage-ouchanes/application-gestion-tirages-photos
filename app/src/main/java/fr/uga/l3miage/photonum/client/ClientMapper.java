package fr.uga.l3miage.photonum.client;

import java.util.Collection;

import org.mapstruct.Mapper;

import fr.uga.l3miage.photonum.data.domain.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO entityToDTO(Client client);

    Collection<ClientDTO> entityToDTO(Iterable<Client> authors);

    Client dtoToEntity(ClientDTO client);

    Collection<Client> dtoToEntity(Iterable<ClientDTO> authors);
}