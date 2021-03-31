package biudzeto_projektas_3;

import java.util.ArrayList;
import java.util.List;

/**
 * čia saugomas sarasas
 */
public class Biudzetas {
    private List<PajamuIrasas> pajamos = new ArrayList<>();
    private List<IslaiduIrasas> islaidos = new ArrayList<>();

    void pridetiIrasa(Irasas irasas) {
        if (irasas instanceof PajamuIrasas) {
            pajamos.add((PajamuIrasas) irasas);
        } else if (irasas instanceof IslaiduIrasas) {
            islaidos.add((IslaiduIrasas) irasas);
        }
    }

    PajamuIrasas gautiPajamuIrasa(int id) {
        return pajamos.get(id);
    }

    IslaiduIrasas gautiIslaiduIrasa(int id) {
        return islaidos.get(id);
    }

    PajamuIrasas trintiPajamuIrasa(int id) {
        return pajamos.remove(id);
    }

    IslaiduIrasas trintiIslaiduIrasa(int id) {
        return islaidos.remove(id);
    }

    List<PajamuIrasas> spausdintiPajamas() {
        return pajamos;
    }

    List<IslaiduIrasas> spausdintiIslaidas() {
        return islaidos;
    }

    double balansas() {
        double balansas;
        double pajamosSuma = 0;
        double islaidosSuma = 0;
        for (PajamuIrasas pajamuIrasas : pajamos) {
            pajamosSuma += pajamuIrasas.getSuma();
        }
        for (IslaiduIrasas islaiduIrasas : islaidos) {
            islaidosSuma += islaiduIrasas.getSuma();
        }
        balansas = pajamosSuma - islaidosSuma;

        return balansas;
    }

    void atnaujintiIrasa(Irasas irasas) {
        for (Irasas pajamuIrasas : pajamos) {
            if (pajamuIrasas.equals(irasas)) {

            }
        }
        for (Irasas islaiduIrasas : islaidos) {
            if (islaiduIrasas.equals(irasas)) {

            }
        }

    }

}
