package de.adorsys.bibliothek.domain;

public class BibMitglied {

     private static int MitgliederZaehler;
    private String name;
    private String adresse;

    public BibMitglied (String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public static int getMitgliederZaehler() {
        return MitgliederZaehler;
    }

    public static void setMitgliederZaehler(int mitgliederZaehler) {
        MitgliederZaehler = mitgliederZaehler;
    }
}
