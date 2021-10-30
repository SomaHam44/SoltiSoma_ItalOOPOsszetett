package com.company.italOOPOsszetett;

public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double a) {
        this.iz = iz;
        this.alkoholTartalom = a;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public String toString() {
        return String.format("Alkoholos ital: %s ízű, alkohol tartalma: %f", this.iz, this.alkoholTartalom);
    }
}
