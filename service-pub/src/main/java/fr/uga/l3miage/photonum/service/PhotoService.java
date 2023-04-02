package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface PhotoService extends BaseService<Photo,Long> {
    /**
     * Saves a photo object
     *
     * @param photo to be saved
     * @return the photo with an id
     */
    Photo save(Photo photo);

    /**
     * Returns a photo by its id
     *
     * @param id of the photo
     * @return the photo
     * @throws EntityNotFoundException when the entity do not already exists
     */ 
    Photo get(Long id) throws EntityNotFoundException;

    /**
     * Returns all photos
     *
     * @return all photos
     */
    Collection<Photo> all();

    /**
     * Updates a photo
     *
     * @param photo to be updated
     * @return the updated photo
     * @throws EntityNotFoundException when the entity do not already exists
     */
    Photo update(Photo photo) throws EntityNotFoundException;

    /**
     * Deletes a photo
     *
     * @param id id of the photo to delete
     * @throws EntityNotFoundException when the entity do not already exists
     */
    void delete(Long id) throws EntityNotFoundException;

    /**
     * Returns all photos of a client
     *
     * @param idClient id of the client
     * @return all photos of a client
     */
    Collection<Photo> allPhotosOfClient(Long idClient);

}
