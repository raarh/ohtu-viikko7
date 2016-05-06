package ohtu.kivipaperisakset.AI;

public class Tekoaly implements AI{

    int siirto;
    private String siirrot[] = {"k","p","s"};
    public Tekoaly() {
        siirto = 0;
    }
    @Override
    public String annaSiirto() {
        return siirrot[(++siirto) % 3];
    }
    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään °~°
    }
}
