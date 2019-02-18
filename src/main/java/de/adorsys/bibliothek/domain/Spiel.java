package de.adorsys.bibliothek.domain;


public class Spiel extends Medium {

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
