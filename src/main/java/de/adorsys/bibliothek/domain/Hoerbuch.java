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

public class Hoerbuch extends Medium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
