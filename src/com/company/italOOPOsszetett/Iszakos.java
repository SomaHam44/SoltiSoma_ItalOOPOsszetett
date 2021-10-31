package com.company.italOOPOsszetett;

public class Iszakos {
    private double turesHatar;
    private double alkoholSzint;

    public Iszakos(double turesHatar) {
        this.turesHatar = turesHatar;
    }

    public void elfogyaszt(Alkoholos a) {
        alkoholSzint += a.mennyiAlkoholtTartalmaz();
        System.out.println(a);

    }

    public int menniytMutatok(int u) {
        int mutat = (int) (this.turesHatar / this.alkoholSzint);
        return mutat;

    }

    public static void main(String args) {
        Iszakos i = new Iszakos(5.5);
        i.elfogyaszt(new Bor("Meggyes félédes ", 11.11, "Fehér","Nógrád"));
        i.menniytMutatok(3);
        i.elfogyaszt(new Bor("Meggyes fél száraz ", 6.25, "Fekete","Szombathely"));
        i.menniytMutatok(2);
    }
}
