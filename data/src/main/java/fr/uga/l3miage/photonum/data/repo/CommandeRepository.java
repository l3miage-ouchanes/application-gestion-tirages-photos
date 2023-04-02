package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Commande;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class CommandeRepository implements CRUDRepository<Long,Commande> {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Commande save(Commande commande) {
        entityManager.persist(commande);
        return commande;
    }

    @Override
    public Commande get(Long id) {
        return entityManager.find(Commande.class, id);
    }

    @Override
    public void delete(Commande commande) {
        entityManager.remove(commande);
    }

    @Override
    public List<Commande> all() {
        String jpql = "SELECT * FROM Commande ORDER BY Commande.id";
        TypedQuery<Commande> query = this.entityManager.createQuery(jpql, Commande.class);
        List<Commande> allCommandes = query.getResultList();
        return allCommandes;
    }
}
