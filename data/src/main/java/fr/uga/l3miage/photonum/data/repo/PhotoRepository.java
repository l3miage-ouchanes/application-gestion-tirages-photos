package fr.uga.l3miage.photonum.data.repo;

import java.util.Collection;
import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Photo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class PhotoRepository implements CRUDRepository<Long, Photo> {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Photo save(Photo photo) {
       entityManager.persist(photo);
       return photo;
    }

    @Override
    public Photo get(Long id) {
        return entityManager.find(Photo.class, id);
    }

    @Override
    public void delete(Photo photo) {
        entityManager.remove(photo);
    }

    @Override
    public List<Photo> all() {
        String jpql = "SELECT * FROM Photo ORDER BY Photo.id";
        TypedQuery<Photo> query = this.entityManager.createQuery(jpql, Photo.class);
        List<Photo> allPhotos = query.getResultList();
        return allPhotos;
    }

    public Collection<Photo> allPhotosOfClient(Long idClient) {

        String jpql = "SELECT p FROM Photo p JOIN p.client c WHERE c.id = :idClient ORDER BY p.id";
        TypedQuery<Photo> query = this.entityManager.createQuery(jpql, Photo.class);
        List<Photo> allPhotos = query.getResultList();
        return allPhotos;
    }
    
    
}
