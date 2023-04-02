package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface ClientService extends BaseService<Client, Long> {
    /**
     * Returns a client by its id
     *
     * @param id of the client
     * @return the client
     * @throws EntityNotFoundException when the entity do not already exists
     */ 
    Client get(Long id) throws EntityNotFoundException;
}
