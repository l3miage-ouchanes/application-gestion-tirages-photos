package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.repo.ImageRepository;

public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Image save(Image impression) {
        return imageRepository.save(impression);
    }

    @Override
    public Image get(Long id) throws EntityNotFoundException {
        return imageRepository.get(id);
    }

    @Override
    public Collection<Image> list() {
        return imageRepository.all();
    }

    @Override
    public Image update(Image image) throws EntityNotFoundException {

        // chercher si dans la base si pas trouvé throw une exception
        Image i = imageRepository.get(image.getId());
        if (i.estPartagee() == true && image.estPartagee() == false) {
            System.out.println("impossible de départager une image partagé");
            return i; // ancienne valeur retournée
        } else { // sinon sauvegardé
            return imageRepository.save(image);
        }
    }

    @Override
    public void remove(Image image) {
        // si image n'est pas partagé et elle n'as pas de photo relié donc elle peut
        // etre supprimé
        if (image.estPartagee() == false && imageRepository.countPhotos(image) == 0) {
            imageRepository.delete(image);
        } else {
            System.out.println("impossible de supprimer l'image car elle est partagée!!!!!!!!!!!!");
        }
    }

}
