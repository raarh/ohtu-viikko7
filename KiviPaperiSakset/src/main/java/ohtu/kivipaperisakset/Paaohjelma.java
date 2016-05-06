package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.KPS.Ikps;
import ohtu.kivipaperisakset.KPS.KPSFactory;


import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private static void tulostaValikko(){
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
    public static void main(String[] args) {
        KPSFactory pelit = new KPSFactory();
        while (true) {
            tulostaValikko();

            String pelinTunnus = scanner.nextLine();
            Ikps peli = pelit.luo(pelinTunnus);
            if(peli != null){
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                peli.pelaa();
            }else {
                break;
            }


        }

    }
}
