package fr.uga.l3miage.photonum.client;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.domain.Impression;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-29T01:54:48+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDTO entityToDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        Long id = null;
        String email = null;
        List<String> prenoms = null;
        List<String> noms = null;
        String mdp = null;
        List<Adresse> adresses = null;
        List<Image> imagesPossedees = null;
        List<Impression> impressions = null;

        id = client.getId();
        email = client.getEmail();
        List<String> list = client.getPrenoms();
        if ( list != null ) {
            prenoms = new ArrayList<String>( list );
        }
        List<String> list1 = client.getNoms();
        if ( list1 != null ) {
            noms = new ArrayList<String>( list1 );
        }
        mdp = client.getMdp();
        List<Adresse> list2 = client.getAdresses();
        if ( list2 != null ) {
            adresses = new ArrayList<Adresse>( list2 );
        }
        List<Image> list3 = client.getImagesPossedees();
        if ( list3 != null ) {
            imagesPossedees = new ArrayList<Image>( list3 );
        }
        List<Impression> list4 = client.getImpressions();
        if ( list4 != null ) {
            impressions = new ArrayList<Impression>( list4 );
        }

        ClientDTO clientDTO = new ClientDTO( id, email, prenoms, noms, mdp, adresses, imagesPossedees, impressions );

        return clientDTO;
    }

    @Override
    public Collection<ClientDTO> entityToDTO(Iterable<Client> authors) {
        if ( authors == null ) {
            return null;
        }

        Collection<ClientDTO> collection = new ArrayList<ClientDTO>();
        for ( Client client : authors ) {
            collection.add( entityToDTO( client ) );
        }

        return collection;
    }

    @Override
    public Client dtoToEntity(ClientDTO client) {
        if ( client == null ) {
            return null;
        }

        Client client1 = new Client();

        List<Adresse> list = client.adresses();
        if ( list != null ) {
            client1.setAdresses( new ArrayList<Adresse>( list ) );
        }
        client1.setEmail( client.email() );
        client1.setId( client.id() );
        List<Image> list1 = client.imagesPossedees();
        if ( list1 != null ) {
            client1.setImagesPossedees( new ArrayList<Image>( list1 ) );
        }
        List<Impression> list2 = client.impressions();
        if ( list2 != null ) {
            client1.setImpressions( new ArrayList<Impression>( list2 ) );
        }
        client1.setMdp( client.mdp() );
        List<String> list3 = client.noms();
        if ( list3 != null ) {
            client1.setNoms( new ArrayList<String>( list3 ) );
        }
        List<String> list4 = client.prenoms();
        if ( list4 != null ) {
            client1.setPrenoms( new ArrayList<String>( list4 ) );
        }

        return client1;
    }

    @Override
    public Collection<Client> dtoToEntity(Iterable<ClientDTO> authors) {
        if ( authors == null ) {
            return null;
        }

        Collection<Client> collection = new ArrayList<Client>();
        for ( ClientDTO clientDTO : authors ) {
            collection.add( dtoToEntity( clientDTO ) );
        }

        return collection;
    }
}
