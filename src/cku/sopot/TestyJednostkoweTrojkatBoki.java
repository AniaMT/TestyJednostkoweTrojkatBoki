package cku.sopot;

import java.util.Scanner;

public class TestyJednostkoweTrojkatBoki {
    static float bokA;
    static float bokB;
    static float bokC;
    static float obwod;
    static float pole;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Podaj długość boku A trójkąta: ");
        bokA = scanner.nextFloat();
        System.out.print ("Podaj długość boku B trójkąta: ");
        bokB = scanner.nextFloat();
        System.out.print ("Podaj długość boku C trójkąta: ");
        bokB = scanner.nextFloat();

        TrojkatBoki trojkatBoki = new TrojkatBoki(bokA, bokB, bokC);
        obwod = trojkatBoki.obliczObwod();
        pole = trojkatBoki.obliczPole();
    }
}
