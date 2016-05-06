package ohtu.kivipaperisakset.KPS;

import ohtu.kivipaperisakset.AI.TekoalyParannettu;

/**
 * Created by arto on 6.5.2016.
 */
public class KPSFactory {

    public KPSFactory(){

    }
    public static KPS moninpeli(){
        return new KPSPelaajaVsPelaaja();
    }
    public static KPS helppoYksinpeli(){
        return new KPSTekoaly();
    }
    public static KPS vaikeaYksinpeli(){
        return new KPSTekoaly(new TekoalyParannettu(20));
    }
}
