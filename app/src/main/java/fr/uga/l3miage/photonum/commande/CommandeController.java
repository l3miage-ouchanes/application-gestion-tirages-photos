package fr.uga.l3miage.photonum.commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.service.CommandeService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import jakarta.validation.Valid;


@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class CommandeController {
    private CommandeService commandeService;
    private CommandeMapper commandeMapper;

    @Autowired
    public CommandeController(CommandeService commandeService, CommandeMapper commandeMapper) {
        this.commandeService = commandeService;
        this.commandeMapper = commandeMapper;
    }

    @GetMapping("clients/{idClient}/commandes{idCommande}")
    public CommandeDTO getCommande(@PathVariable("idClient") Long idClient, @PathVariable("idCommande") Long idCommande) throws EntityNotFoundException{
        try {
            Commande commande = commandeService.get(idCommande);

            if (commande.getArticles().get(0).getImpression().getProprietaire().getId() != idClient) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }

            return commandeMapper.entityToDTO(commande);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        }
    }

    @PostMapping("clients/{idClient}/commandes")
    public CommandeDTO createCommande(@PathVariable("idClient") Long idClient, @RequestBody @Valid CommandeDTO commande) {
        Commande saved = commandeService.save(commandeMapper.dtoToEntity(commande));

        if (saved.getArticles().get(0).getImpression().getProprietaire().getId() != idClient) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return commandeMapper.entityToDTO(saved);
    }

}
