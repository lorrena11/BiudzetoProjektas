package biudzeto_projektas_1;

/**
 * čia saugoma pajamų įrašo objekto informaciją
 */
public class PajamuIrasas {
    private String dataPajamu;
    private int sumaPajamu;
    private String kategorijaPajamu;
    private String pozymisArLegalus;
    private String papildomaInfoPajamu;

    public PajamuIrasas(String dataPajamu, int sumaPajamu, String kategorijaPajamu, String pozymisArLegalus, String papildomaInfoPajamu) {
        this.dataPajamu = dataPajamu;
        this.sumaPajamu = sumaPajamu;
        this.kategorijaPajamu = kategorijaPajamu;
        this.pozymisArLegalus = pozymisArLegalus;
        this.papildomaInfoPajamu = papildomaInfoPajamu;
    }

    public String getDataPajamu() {
        return dataPajamu;
    }

    public void setDataPajamu(String dataPajamu) {
        this.dataPajamu = dataPajamu;
    }

    public int getSumaPajamu() {
        return sumaPajamu;
    }

    public void setSumaPajamu(int sumaPajamu) {
        this.sumaPajamu = sumaPajamu;
    }

    public String getKategorijaPajamu() {
        return kategorijaPajamu;
    }

    public void setKategorijaPajamu(String kategorijaPajamu) {
        this.kategorijaPajamu = kategorijaPajamu;
    }

    public String getPozymisArLegalus() {
        return pozymisArLegalus;
    }

    public void setPozymisArLegalus(String pozymisArLegalus) {
        this.pozymisArLegalus = pozymisArLegalus;
    }

    public String getPapildomaInfoPajamu() {
        return papildomaInfoPajamu;
    }

    public void setPapildomaInfoPajamu(String papildomaInfoPajamu) {
        this.papildomaInfoPajamu = papildomaInfoPajamu;
    }
}
