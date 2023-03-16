package fr.uga.l3miage.photonum.data.domain;

import java.util.Set;

public class Album extends Impression {
    private String format;
    private String qualite;
    private Couverture couverture;
    private Set<Page> pages;
}
