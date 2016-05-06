package ohtu.kivipaperisakset.KPS;

import ohtu.kivipaperisakset.AI.TekoalyParannettu;

import java.util.HashMap;

/**
 * Created by arto on 6.5.2016.
 */
public class KPSFactory {
    HashMap<String, KPS> kps;
    public KPSFactory(){
        kps = new HashMap<String, KPS>();
        kps.put("a", new KPSPelaajaVsPelaaja());
        kps.put("b",new KPSTekoaly());
        kps.put("c",new KPSTekoaly(new TekoalyParannettu(20)));
    }
    public KPS luo(String peli){
        return kps.get(peli);
    }

}
