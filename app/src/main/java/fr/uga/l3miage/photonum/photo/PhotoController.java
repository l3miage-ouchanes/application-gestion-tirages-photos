package fr.uga.l3miage.photonum.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import fr.uga.l3miage.photonum.service.PhotoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class PhotoController {
    private final PhotoMapper photoMapper;
    private final PhotoService photoService;

    @Autowired
    public PhotoController(PhotoMapper photoMapper, PhotoService photoService) {
        this.photoMapper = photoMapper;
        this.photoService = photoService;
    }

    @PostMapping("client/{clientId}/photos")
    @ResponseStatus(HttpStatus.CREATED)
    public PhotoDTO newPhoto(@PathVariable("clientId") Long clientId, @Valid @RequestBody PhotoDTO photo) {
        Photo photoToSave = photoMapper.dtoToEntity(photo);

        // cas où l'image n'est pas partagée et que le client n'est pas le propriétaire
        if(photoToSave.getImage().getPossesseur().getId() != clientId && photoToSave.getImage().estPartagee() == false) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        Photo saved = photoService.save(photoToSave);
        return photoMapper.entityToDTO(saved);
    }
    
}
