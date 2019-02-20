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

public class AusleihVorgang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BibMitglied ausleiher;
    private Medium leihObjekt;
    private Datum leihBeginn;
    private Datum leihEnde;



    public AusleihVorgang(BibMitglied ausleiher, Medium leihObjekt, Datum leihBeginn, Datum leihEnde) {
        this.ausleiher = ausleiher;
        this.leihObjekt = leihObjekt;
        this.leihBeginn = leihBeginn;
        this.leihEnde = leihEnde;
        //ausleiher.addAusleiVorgang(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public BibMitglied getAusleiher() {
        return ausleiher;
    }

    public void setAusleiher(BibMitglied ausleiher) {
        this.ausleiher = ausleiher;
    }

    public Medium getLeihObjekt() {
        return leihObjekt;
    }

    public void setLeihObjekt(Medium leihObjekt) {
        this.leihObjekt = leihObjekt;
    }

    public Datum getLeihBeginn() {
        return leihBeginn;
    }

    public void setLeihBeginn(Datum leihBeginn) {
        this.leihBeginn = leihBeginn;
    }

    public Datum getLeihEnde() {
        return leihEnde;
    }

    public void setLeihEnde(Datum leihEnde) {
        this.leihEnde = leihEnde;
    }

    public void addAusleihVorgang () {

    }
}
