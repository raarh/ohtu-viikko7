package ohtu.kivipaperisakset.KPS;


import ohtu.kivipaperisakset.Tuomari;

import java.util.Scanner;


abstract class KPS implements Ikps{
    private Scanner scanner;
    private Tuomari tuomari;
    protected String ekanSiirto;
    protected String tokanSiirto;

    public KPS(Scanner s, Tuomari t){
        this.scanner = s;
        this.tuomari = t;
    }

    protected String lueRivi(){
        return scanner.nextLine();
    }
    protected void tulostaTuomari(String viesti){
        System.out.println(tuomari);
        System.out.println(viesti);
    }
    protected void tuomariKirjaaSiirrot(){
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
    }

    protected boolean ovatkoSiirrotOK(){
        return onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto);
    }
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected void lueSiirrot(){
        lueEnsimmaisenPelaajanSiirrot();
        lueToisenPelaajanSiirrot();

    }

    abstract protected void lueEnsimmaisenPelaajanSiirrot();

    abstract protected void lueToisenPelaajanSiirrot();
    abstract public void pelaa();

}
