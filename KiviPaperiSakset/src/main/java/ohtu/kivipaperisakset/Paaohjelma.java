package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.KPS.Ikps;
import ohtu.kivipaperisakset.KPS.KPSFactory;


import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KPSFactory pelit = new KPSFactory();
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                Ikps kaksinpeli = pelit.moninpeli();
                kaksinpeli.pelaa();
            } else if (vastaus.endsWith("b")) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                Ikps yksinpeli = pelit.helppoYksinpeli();
                yksinpeli.pelaa();

            } else if (vastaus.endsWith("c")) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                Ikps pahaYksinpeli = pelit.vaikeaYksinpeli();
                pahaYksinpeli.pelaa();
            } else {
                break;
            }

        }

    }
}
