package biudzeto_projektas_2;

import java.util.ArrayList;
import java.util.List;

/**
 * čia saugomi sarasai
 */
public class Biudzetas {
    private List<PajamuIrasas> pajamos = new ArrayList<>();
    private List<IslaiduIrasas> islaidos = new ArrayList<>();
    private static int idpajamos = 0;
    private static int idislaidos = 0;

    void pridetiPajamuIrasa(String dataPajamu, int sumaPajamu, String kategorijaPajamu, String pozymisArLegalus, String papildomaInfoPajamu) {
        PajamuIrasas objPajamos = new PajamuIrasas(idpajamos, dataPajamu, sumaPajamu, kategorijaPajamu, pozymisArLegalus, papildomaInfoPajamu);
        pajamos.add(objPajamos);
        idpajamos++;
    }

    void pridetiIslaiduIrasa(String dataIslaidu, int sumaIslaidu, String kategorijaIslaidu, String pozymisArLegalus, String papildomaInfoIslaidu) {
        IslaiduIrasas objIslaidos = new IslaiduIrasas(idislaidos, dataIslaidu, sumaIslaidu, kategorijaIslaidu, pozymisArLegalus, papildomaInfoIslaidu);
        islaidos.add(objIslaidos);
        idislaidos++;
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

    void spausdintiPajamas() {
        String formatuotaEilute = "";
        System.out.println("Pajamos:");
        for (PajamuIrasas irasas : pajamos) {
            formatuotaEilute = String.format("%d. - %s - Pajamos: %d eur; kategorija: %s; legalumas: %s; papildoma info: %s.",
                    irasas.getId(), irasas.getDataPajamu(), irasas.getSumaPajamu(), irasas.getKategorijaPajamu(),
                    irasas.getPozymisArLegalus(), irasas.getPapildomaInfoPajamu());
            System.out.println(formatuotaEilute);
        }
    }

    void spausdintiIslaidas() {
        String formatuotaEilute = "";
        System.out.println("Išlaidos:");
        for (IslaiduIrasas irasas : islaidos) {
            formatuotaEilute = String.format("%d. - %s - Išlaidos: %d eur; kategorija: %s; legalumas: %s; papildoma info: %s.",
                    irasas.getId(), irasas.getDataIslaidu(), irasas.getSumaIslaidu(), irasas.getKategorijaIslaidu(),
                    irasas.getPozymisArLegalus(), irasas.getPapildomaInfoIslaidu());
            System.out.println(formatuotaEilute);
        }
    }

    double balansas() {
        double balansas;
        double pajamosSuma = 0;
        double islaidosSuma = 0;
        for (PajamuIrasas pajamuIrasas : pajamos) {
            pajamosSuma += pajamuIrasas.getSumaPajamu();
        }
        for (IslaiduIrasas islaiduIrasas : islaidos) {
            islaidosSuma += islaiduIrasas.getSumaIslaidu();
        }
        balansas = pajamosSuma - islaidosSuma;

        return balansas;
    }

}
