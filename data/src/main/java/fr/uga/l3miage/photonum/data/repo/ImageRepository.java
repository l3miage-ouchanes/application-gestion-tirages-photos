package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Image;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class ImageRepository implements CRUDRepository<Long, Image> {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Image save(Image image) {
        entityManager.persist(image);
        return image;
    }

    @Override
    public Image get(Long id) {
        return entityManager.find(Image.class, id);
    }


    @Override
    public void delete(Image image) {
        entityManager.remove(image);
    }


    @Override
    public List<Image> all() {
        String jpql = "SELECT * FROM Image ORDER BY Image.id";
        TypedQuery<Image> query = this.entityManager.createQuery(jpql, Image.class);
        List<Image> allImages = query.getResultList();
        return allImages;
    }

    
}
