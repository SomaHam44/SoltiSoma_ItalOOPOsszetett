package com.company.italOOPOsszetett;

public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }

    public String milyenFajtaju() {
        return fajta;
    }

    public String milyenizu() {
        return iz;
    }

    @Override
    public String toString() {
        return String.format("Gyümölcs: %s - íz: %s", this.fajta, this.iz);
    }


}
