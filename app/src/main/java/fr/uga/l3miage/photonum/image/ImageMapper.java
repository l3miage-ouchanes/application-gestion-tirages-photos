package fr.uga.l3miage.photonum.image;

@Mapper(componentModel = "spring")
public class ImageMapper {
    AuthorDTO entityToDTO(Author author);

    Collection<AuthorDTO> entityToDTO(Iterable<Author> authors);

    Author dtoToEntity(AuthorDTO author);

    Collection<Author> dtoToEntity(Iterable<AuthorDTO> authors);
}
