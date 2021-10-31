package com.company.italOOPOsszetett;

public class Bor extends AlkoholosItal{
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String iz, double alkoholTartalom, String szoloFajta, String termoTerulet) {
        super(iz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    public String milyenSzolobolKeszult() {
        return szoloFajta;
    }

    public String holTermett() {
        return termoTerulet;
    }

    @Override
    public String mibolKeszult() {
        return this.szoloFajta;
    }


    @Override
    public String toString() {
        return  "Bor: " + this.szoloFajta + " fajtájúból " + this.termoTerulet + "i " + super.toString();
    }
}
