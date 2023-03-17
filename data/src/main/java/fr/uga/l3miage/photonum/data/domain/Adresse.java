package fr.uga.l3miage.photonum.data.domain;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "numero")
    private int numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "codePostal")
    private int codePostal;

    @Column(name = "ville")
    private String ville;

    @ManyToMany
    private Set<Client> clients; 


    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
