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
        String jpql = "SELECT i FROM Image i ORDER BY i.id";
        TypedQuery<Image> query = this.entityManager.createQuery(jpql, Image.class);
        List<Image> allClients = query.getResultList();
        return allClients;
    }

    // compte le nombre de Photos relié à une image passée en paramètres
    public Long countPhotos(Image image) {
        String jpql = "SELECT count(p.id) FROM Image i join i.Photo WHERE i.id = :idImage";
        TypedQuery<Long> query = this.entityManager.createQuery(jpql, Long.class);
        query.setParameter("idImage", image.getId());
        Long nombrePhoto = query.getSingleResult();
        return nombrePhoto;
    }

}
