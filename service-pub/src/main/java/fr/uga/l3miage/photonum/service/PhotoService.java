package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface PhotoService extends BaseService<Photo, Long> {
    /**
     * Saves a photo object
     *
     * @param photo to be saved
     * @return the photo with an id
     */
    Photo save(Photo photo);
}
