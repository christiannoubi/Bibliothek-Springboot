package de.adorsys.bibliothek.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity


public class Buch extends Medium{

    @Id @GeneratedValue
    private Long id;
    private String autor;
    private BuchArt art;

    public Buch (String autor, String name, int erscheinungsJahr, String verlag, BuchArt art) {
        this.autor = autor;
        this.name = name;
        this.erscheinungsJahr = erscheinungsJahr;
        this.verlag = verlag;
        this.art = art;
        this.medienNr = Medium.mediumZaehler++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public BuchArt getArt() {
        return art;
    }

    public void setArt(BuchArt art) {
        this.art = art;
    }

    public void print () {
        System.out.println("Medium mit Nr. "+ medienNr + "ist Buch der Art " + art + ".");
        System.out.println("Titel des Buches:" + name);
        System.out.println("Autor/-in des Buches:" + autor);
        System.out.println("erschienen"+ erscheinungsJahr + "beim Verlag " + verlag + ".");
    }
}
