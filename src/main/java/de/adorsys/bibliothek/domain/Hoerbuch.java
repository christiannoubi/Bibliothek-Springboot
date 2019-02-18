package de.adorsys.bibliothek.domain;

public class Hoerbuch extends Medium {

    private String autor;
    private int cdAnz;
    private int spieldauer;

    public Hoerbuch (String autor, String name, int erscheinungsJahr, String verlag, int cdAnz, int spieldauer) {
        this.autor = autor;
        this.name = name;
        this.erscheinungsJahr = erscheinungsJahr;
        this.verlag = verlag;
        this.cdAnz = cdAnz;
        this.spieldauer = spieldauer;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCdAnz() {
        return cdAnz;
    }

    public void setCdAnz(int cdAnz) {
        this.cdAnz = cdAnz;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public void print() {}
}
