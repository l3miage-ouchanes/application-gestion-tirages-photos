package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface ImageService extends BaseService<Image, Long> {

    /**
     * Deletes an image
     *
     * @param id id of the image to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteImageException   when an image is shared
     */
    
    void delete(int id) throws EntityNotFoundException, DeleteImageException;

   

    /**
     * Returns toutes les images 
     *
     * @return toutes les images 
     */ 
    Collection<Image> all();
    
    
}
