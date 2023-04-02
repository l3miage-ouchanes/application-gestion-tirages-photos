package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface CommandeService extends BaseService<Commande, Long> {
    /**
     * Returns a commande by its id
     *
     * @param id of the commande
     * @return the commande
     * @throws EntityNotFoundException when the entity do not already exists
     */ 
    Commande get(Long id) throws EntityNotFoundException;


    /**
     * Saves a commande object
     *
     * @param commande to be saved
     * @return the commande with an id
     */
    Commande save(Commande Commande);
}
