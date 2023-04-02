package fr.uga.l3miage.photonum.service;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.data.repo.CommandeRepository;

public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository commandeRepository;

    @Autowired
    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    public Commande get(Long id) throws EntityNotFoundException {
        return commandeRepository.get(id);
    }

    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }
}
