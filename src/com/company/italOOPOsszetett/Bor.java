package com.company.italOOPOsszetett;

public class Bor extends AlkoholosItal{
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String iz, double a, String szoloFajta, String termoTerulet) {
        super(iz, a);
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
        return null;
    }


    @Override
    public String toString() {
        return  "Bor: " + this.szoloFajta + " fajtájúból " + this.termoTerulet + " készült " + super.toString();
    }
}
