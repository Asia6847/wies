package com.company;

public class Main {

    public static void main(String[] args) {
        Pies reksio = new Pies();
        Pies reksioZParametrami = new Pies(10, "reksio", true);
        reksioZParametrami.wysokosc = 100;
        Pies reksio3 = new Pies();

        Pies leśnyPies = new Pies();

        // pętla for
//        for (int licznik = 1; licznik < 501; licznik++) {
//             leśnyPies.idźDoLasu();
//        }

        int licznik = 1;
        while (licznik < 502) {
            leśnyPies.idźDoLasu();
            licznik++;
        }

        reksio3.nakarm();
        leśnyPies.odkleszcz();
        int a =10;
    }
}
