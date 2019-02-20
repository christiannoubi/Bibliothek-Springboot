package de.adorsys.bibliothek.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode
@ToString
public class BibMitgliederVerwaltung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    final static int MAX_MEDIEN_ANZ = 100000;
    private Long id;
    private Medium[] medien;
    private int aktMaxMedienNr;

    public BibMitgliederVerwaltung () {
        medien = new Medium[MAX_MEDIEN_ANZ];
        aktMaxMedienNr = 0;
    }

    public void add (BibMitglied bibMitglied) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void print () {
        System.out.println();
        System.out.println("-------Folgende Medien sind in der Medienverwaltung" + "gespeichert:--------");
        for ( int i = 0; i < aktMaxMedienNr; i++) {
            medien[i].print();
            System.out.println();
        }
    }
}
