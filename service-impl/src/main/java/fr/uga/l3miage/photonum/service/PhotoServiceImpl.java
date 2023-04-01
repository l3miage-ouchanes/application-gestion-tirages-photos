package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.data.repo.PhotoRepository;

public class PhotoServiceImpl  implements PhotoService {
    

    private final PhotoRepository photoRepository;

    @Autowired
    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public Photo get(Long id) throws EntityNotFoundException {
    
        return photoRepository.get(id);
    }

    @Override
    public Collection<Photo> list() {
        return photoRepository.all();
    }

    @Override
    public Photo update(Photo object) throws EntityNotFoundException {
       return photoRepository.save(object);
    }

    @Override
    public void delete(Long id) throws EntityNotFoundException {
       
       
        Photo photoSupp = get(id);

        if (photoSupp == null) {
            throw new EntityNotFoundException("photo avec id=%d non trouvée".formatted(id));
        }
        else{
            photoRepository.delete(photoSupp);
         }   
    }


    @Override
    public Collection<Photo> allPhotosOfClient(Long idClient) {
        return photoRepository.allPhotosOfClient(idClient);
        
    }

    @Override
    public Photo save(Photo photo) {
        return photoRepository.save(photo);
    }


}
