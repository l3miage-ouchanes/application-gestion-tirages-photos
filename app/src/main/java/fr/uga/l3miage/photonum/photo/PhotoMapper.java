package fr.uga.l3miage.photonum.photo;

import org.mapstruct.Mapper;

import fr.uga.l3miage.photonum.data.domain.Photo;

@Mapper(componentModel = "spring")
public interface PhotoMapper {
    PhotoDTO entityToDTO(Photo photo);

    Photo dtoToEntity(PhotoDTO photo);
}
