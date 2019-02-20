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
public class Spiel extends Medium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int minSpielerAnz;
    private int maxSpielerAnz;
    private int minAlter;

    public Spiel (String name, int erscheinungsJahr, String verlag, int minSpielerAnz, int maxSpielerAnz, int minAlter) {
                this.name = name;
                this.erscheinungsJahr = erscheinungsJahr;
                this.verlag = verlag;
                this.minSpielerAnz = minSpielerAnz;
                this.maxSpielerAnz = maxSpielerAnz;
                this.minAlter = minAlter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMinSpielerAnz() {
        return minSpielerAnz;
    }

    public void setMinSpielerAnz(int minSpielerAnz) {
        this.minSpielerAnz = minSpielerAnz;
    }

    public int getMaxSpielerAnz() {
        return maxSpielerAnz;
    }

    public void setMaxSpielerAnz(int maxSpielerAnz) {
        this.maxSpielerAnz = maxSpielerAnz;
    }

    public int getMinAlter() {
        return minAlter;
    }

    public void setMinAlter(int minAlter) {
        this.minAlter = minAlter;
    }

    public void print () {}


}
