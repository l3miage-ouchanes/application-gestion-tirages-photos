package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;

public interface ClientService {
    /**
     * Returns a client by its id
     *
     * @param id of the client
     * @return the client
     * @throws EntityNotFoundException when the entity do not already exists
     */
    Client get(Long id) throws EntityNotFoundException;
}
