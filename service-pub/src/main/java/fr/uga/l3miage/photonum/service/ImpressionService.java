package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Impression;

public interface ImpressionService {

    /**
     * Returns toutes les impressions 
     *
     * @return toutes les impressions 
     */ 
    Collection<Impression> all();


}