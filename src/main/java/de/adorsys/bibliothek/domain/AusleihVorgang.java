package de.adorsys.bibliothek.domain;

public class AusleihVorgang {

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
