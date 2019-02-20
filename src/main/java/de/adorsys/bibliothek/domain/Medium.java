package de.adorsys.bibliothek.domain;



public abstract class Medium {


    protected static int mediumZaehler = 0;
    protected String name;
    protected int erscheinungsJahr;
    protected String verlag;
    protected int medienNr;

    public int getMediumZaehler() {
        return mediumZaehler;
    }

    public void setMediumZaehler(int mediumZaehler) {
        this.mediumZaehler = mediumZaehler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(int erscheinungsJahr) {
        this.erscheinungsJahr = erscheinungsJahr;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public int getMedienNr() {
        return medienNr;
    }

    public void setMedienNr(int medienNr) {
        this.medienNr = medienNr;
    }

    public  abstract void  print ();
}
