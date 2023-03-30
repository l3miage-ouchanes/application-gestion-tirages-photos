package fr.uga.l3miage.photonum.image;

import org.mapstruct.Mapper;

import fr.uga.l3miage.photonum.data.domain.Image;

@Mapper(componentModel = "spring")
public interface ImageMapper {
    ImageDTO entityToDTO(Image image);

    Image dtoToEntity(ImageDTO image);

}
