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
        return imageRepository.save(image);
    }

    @Override
    public void remove(Image image) {
        if (image.estPartagee() == false) {
            imageRepository.delete(image);
        } else {
            System.out.println("impossible de supprimer l'image car elle est partagée!!!!!!!!!!!!");
        }
    }

}
