package ohtu.kivipaperisakset.KPS;

import ohtu.kivipaperisakset.AI.AI;
import ohtu.kivipaperisakset.AI.Tekoaly;
import ohtu.kivipaperisakset.Tuomari;

import java.util.Scanner;

public class KPSTekoaly extends KPS {
    private AI tekoaly;
    public KPSTekoaly(){
        this(new Tekoaly());
    }
    public KPSTekoaly(AI ai){
        this(new Scanner(System.in), new Tuomari(),ai);
    }
    public KPSTekoaly(Scanner s, Tuomari t, AI ai){
        super(s,t);
        this.tekoaly = ai;
    }
    public void pelaa() {
        lueSiirrot();

        while (ovatkoSiirrotOK()) {
            tuomariKirjaaSiirrot();
            tulostaTuomari("");
            lueSiirrot();
            tekoaly.asetaSiirto(ekanSiirto);
        }
        System.out.println();
        tulostaTuomari("Kiitos!");

    }
    @Override
    protected void lueEnsimmaisenPelaajanSiirrot(){
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = lueRivi();
    }
    @Override
    protected void lueToisenPelaajanSiirrot(){
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
    }
}