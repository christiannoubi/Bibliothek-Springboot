package de.adorsys.bibliothek.domain;

public class AusleihVorgangsVerwaltung {

    final static int MAX_MEDIEN_ANZ = 100000;

    private Medium[] medien;
    private int aktMaxMedienNr;

    public AusleihVorgangsVerwaltung () {
        medien = new Medium[MAX_MEDIEN_ANZ];
        aktMaxMedienNr = 0;
    }

    public void add (AusleihVorgang ausleihVorgang) {

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
