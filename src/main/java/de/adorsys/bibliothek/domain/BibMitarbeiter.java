package de.adorsys.bibliothek.domain;

public class BibMitarbeiter extends BibMitglied {


    private String lage;
    private String email;
    private String telefonnummer;

    public BibMitarbeiter(String name, String adresse, String lage, String email, String telefonnummer)  {

        super(name, adresse);
        this.lage = lage;
        this.email = email;
        this.telefonnummer = telefonnummer;
    }

    public String getLage() {
        return lage;
    }

    public void setLage(String lage) {
        this.lage = lage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
