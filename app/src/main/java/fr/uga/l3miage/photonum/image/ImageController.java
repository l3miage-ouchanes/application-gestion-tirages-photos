package fr.uga.l3miage.photonum.image;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImageController {
    
    private final ImageService imageService;
    private final ImageMapper imageMapper;

}
