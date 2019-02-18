package de.adorsys.bibliothek.domain;

public class MedienVerwaltung {

    final static int MAX_MEDIEN_ANZ = 100000;

    private Medium[] medien;
    private int aktMaxMedienNr;

    public MedienVerwaltung () {
        medien = new Medium[MAX_MEDIEN_ANZ];
        aktMaxMedienNr = 0;
    }

    public void add (Medium medium) {
        if (aktMaxMedienNr < MAX_MEDIEN_ANZ) {
            medien[aktMaxMedienNr++] = medium;
        } else {
            System.out.println("Hinzufuegen des Mediums noch moeglich,"
            + " da Medienverwaltung voll");
            System.out.println("Folgendes Medium wurde nicht hinzufuegt");
            medium.print();
        }
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
