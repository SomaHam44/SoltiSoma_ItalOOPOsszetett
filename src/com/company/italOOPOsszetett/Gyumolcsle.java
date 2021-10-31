package com.company.italOOPOsszetett;

public class Gyumolcsle extends Ital {
    private Gyumolcs gyumolcs;

    public Gyumolcsle(Gyumolcs gy) {
        this.gyumolcs = gy;
    }

    public String mibolFacsartak() {
        return this.gyumolcs.milyenFajtaju();
    }

    @Override
    public String mibolKeszult() {
        return gyumolcs.milyenFajtaju();
    }

    @Override
    public String milyenIzu() {
        return this.gyumolcs.milyenizu();
    }

    @Override
    public String toString() {
        return "Gyümölcslé: " +  this.gyumolcs.milyenFajtaju() + " gyümölcsből" + "íze: " + this.gyumolcs.milyenizu();
    }
}
