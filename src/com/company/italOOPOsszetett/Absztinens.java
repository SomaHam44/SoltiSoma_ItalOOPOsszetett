package com.company.italOOPOsszetett;

public class Absztinens {

    public Absztinens() {

    }

    public void elfogyaszt(Object o) {
        System.out.println("Elfogyasztod az innivalót ?");
        if (o instanceof Alkoholos ) {
            System.out.println("Nem, mert alkoholos ital volt");
        }
        else {
            System.out.println("Igen, és ízlett nagyon");
        }
        System.out.println();

    }

    public static void main(String args) {
        Absztinens absztinens = new Absztinens();
        absztinens.elfogyaszt(new Gyumolcsle(new Gyumolcs("Banán", "banános")));
        absztinens.elfogyaszt(new Gyumolcsle(new Gyumolcs("Eper", "epres")));
        absztinens.elfogyaszt(new Gyumolcsle(new Gyumolcs("Mangó", "mangós")));
        absztinens.elfogyaszt(new Bor("Édes",10.5, "fekete","Hortobágy"));
        absztinens.elfogyaszt(new Aszu("Édes",10.2, "fekete",3));
        absztinens.elfogyaszt(new ErjedtGyumolcs("Erjedt füge", "fügés", 4.44));
    }
}
