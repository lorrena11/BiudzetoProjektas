package biudzeto_projektas_1;

/**
 * čia saugomi du masyvai
 */
public class Biudzetas {

    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    private static int idpajamos = 0;
    private static int idislaidos = 0;

    void pridetiPajamuIrasa(String dataPajamu, int sumaPajamu, String kategorijaPajamu, String pozymisArLegalus, String papildomaInfoPajamu) {
        PajamuIrasas objPajamos = new PajamuIrasas(dataPajamu, sumaPajamu, kategorijaPajamu, pozymisArLegalus, papildomaInfoPajamu);
        pajamos[idpajamos] = objPajamos;
        idpajamos++;
    }

    void pridetiIslaiduIrasa(String dataIslaidu, int sumaIslaidu, String kategorijaIslaidu, String pozymisArLegalus, String papildomaInfoIslaidu) {
        IslaiduIrasas objIslaidos = new IslaiduIrasas(dataIslaidu, sumaIslaidu, kategorijaIslaidu, pozymisArLegalus, papildomaInfoIslaidu);
        islaidos[idislaidos] = objIslaidos;
        idislaidos++;
    }

    public PajamuIrasas gautiPajamuIrasa(int id) {
        return pajamos[id];
    }

    public IslaiduIrasas gautiIslaiduIrasa(int id) {
        return islaidos[id];
    }


    // todo: įdėt į sekančią dalį:
//    public PajamuIrasas trintiPajamuIrasa(int id) {
//
//        return pajamos.remove(id);
//    }

}
