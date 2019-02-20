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

public class BibMitarbeiter extends BibMitglied {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lage;
    private String email;
    private String telefonnummer;

    public BibMitarbeiter(String name, String adresse, String lage, String email, String telefonnummer)  {

        super(name, adresse);
        this.lage = lage;
        this.email = email;
        this.telefonnummer = telefonnummer;
    }
    public BibMitarbeiter () {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
