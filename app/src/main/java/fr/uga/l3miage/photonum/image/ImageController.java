package fr.uga.l3miage.photonum.image;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.service.DeleteImageException;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import fr.uga.l3miage.photonum.service.ImageService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImageController {
    
    private final ImageMapper imageMapper;
    private final ImageService imageService;

    @Autowired
    public ImageController(ImageMapper imageMapper, ImageService imageService) {
        this.imageMapper = imageMapper;
        this.imageService = imageService;
    }

    // modification d'une image
    @PutMapping("clients/{clientId}/images/{imageId}")
    public ImageDTO updateImage(@PathVariable("clientId") Long clientId, @PathVariable("imageId") Long imageId, @Valid @RequestBody ImageDTO image) throws EntityNotFoundException {
        try {
            Image updated = imageService.update(imageMapper.dtoToEntity(image));
            return imageMapper.entityToDTO(updated);
        } catch(EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    //suppression d'une image
    @DeleteMapping("clients/{clientId}/images/{imageId}")
    public void deleteImage(@PathVariable("clientId") Long clientId, @PathVariable("imageId") Long imageId) throws EntityNotFoundException, DeleteImageException {
        try {
            imageService.delete(imageId);
        } catch(EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } catch(DeleteImageException e) { // si l'image est partagée
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    // visualisation de la liste des images PARTAGEES
    @GetMapping("images")
    public List<ImageDTO> getImagesPartagees() {

        Collection<Image> allImages;
        Collection<Image> imagesPartagees;
        imagesPartagees = new ArrayList<Image>();
       
        allImages = imageService.all();
        for(Image image : allImages) {
            if(image.estPartagee() == true) {
                imagesPartagees.add(image);
            }
        }

        return allImages.stream().map(imageMapper::entityToDTO).toList();
        
    }

}
