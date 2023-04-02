package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Image;

public interface ImageService {

    /**
     * Deletes an image
     *
     * @param id id of the image to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteImageException   quand l'image est partagée ou quand l'image n'est lié à aucune photo dans une impression en cours
     */
    
    void delete(Long id) throws EntityNotFoundException, DeleteImageException;

   
    /**
     * Returns toutes les images 
     *
     * @return toutes les images 
     */ 
    Collection<Image> all();


    /**
     * Updates an image
     *
     * @param image to be updated
     * @return the updated image
     * @throws EntityNotFoundException when the entity do not already exists
     */
    Image update(Image image) throws EntityNotFoundException;

    
    
    
}
