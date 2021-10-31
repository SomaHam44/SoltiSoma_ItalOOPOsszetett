package com.company.italOOPOsszetett;

public class Aszu extends Bor{
     private int puttonySzam;

    public Aszu(String iz, double alkoholTartalom, String termoTerulet, int puttonySzam) {
        super(iz, alkoholTartalom, "Aszu", termoTerulet);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return  "Aszu: " + super.toString() + " puttonyok száma: " + this.puttonySzam;
    }
}
