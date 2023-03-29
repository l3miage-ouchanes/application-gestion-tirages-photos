package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.uga.l3miage.photonum.data.domain.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class ClientRepository implements CRUDRepository<Long, Client> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Client save(Client client){
        entityManager.persist(client);
        return client;
    }

    @Override
    public Client get(Long id){
        return entityManager.find(Client.class, id);
    }

    @Override
    public void delete(Client client){
        entityManager.remove(client);
    }
    
    @Override
    public List<Client> all(){
        String jpql = "SELECT c FROM Client c ORDER BY c.id";
        TypedQuery<Client> query = this.entityManager.createQuery(jpql, Client.class);
        List<Client> allClients = query.getResultList();
        return allClients;
    }
}
