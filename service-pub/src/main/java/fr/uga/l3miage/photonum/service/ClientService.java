package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface ClientService extends BaseService<Client, Long>{
    /**
     * Saves an author object
     *
     * @param author to be saved
     * @return the author with an id
     */
    Client save(Client client);


}
