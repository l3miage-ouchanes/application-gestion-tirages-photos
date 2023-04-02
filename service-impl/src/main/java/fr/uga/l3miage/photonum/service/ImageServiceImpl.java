package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.repo.ImageRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image get(Long id) throws EntityNotFoundException {
    
        return imageRepository.get(id);
    }

    public Collection<Image> all() {
        return imageRepository.all();
    }

    public Image update(Image object) throws EntityNotFoundException {
       return imageRepository.save(object);
    }

    public void delete(Long id) throws EntityNotFoundException, DeleteImageException {
        //trouve l'image correspondant à l'id en paramètres
        Image imageSupp = get(id);
        //si l'image n'existe pas, on lance une exception
        if (imageSupp == null) {
            throw new EntityNotFoundException("image avec id=%d non trouvée".formatted(id));
        }
        //si l'image est partagée, on ne peut pas la supprimer
        if (imageSupp.estPartagee()) {
            throw new DeleteImageException("image avec id=%d ne peut être supprimée car elle est partagée".formatted(id));
        } 
        //sinon on supprime l'image
        imageRepository.delete(imageSupp);  
    }
   
}
