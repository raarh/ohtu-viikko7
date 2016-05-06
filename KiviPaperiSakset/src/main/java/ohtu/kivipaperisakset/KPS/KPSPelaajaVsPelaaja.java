package ohtu.kivipaperisakset.KPS;

import ohtu.kivipaperisakset.Tuomari;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    public KPSPelaajaVsPelaaja(){
        super(new Scanner(System.in),new Tuomari());
    }

    @Override
    protected void lueEnsimmaisenPelaajanSiirrot(){
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = lueRivi();
    }
    @Override
    protected void lueToisenPelaajanSiirrot(){
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = lueRivi();
    }

}