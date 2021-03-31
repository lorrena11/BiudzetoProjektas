package biudzeto_projektas_2;

/**
 * čia saugoma išlaidų įrašo objekto informaciją
 */
public class IslaiduIrasas {
    private int id;
    private String dataIslaidu;
    private int sumaIslaidu;
    private String kategorijaIslaidu;
    private String pozymisArLegalus;
    private String papildomaInfoIslaidu;

    public IslaiduIrasas(int id, String dataIslaidu, int sumaIslaidu, String kategorijaIslaidu, String pozymisArLegalus, String papildomaInfoIslaidu) {
        this.id = id;
        this.dataIslaidu = dataIslaidu;
        this.sumaIslaidu = sumaIslaidu;
        this.kategorijaIslaidu = kategorijaIslaidu;
        this.pozymisArLegalus = pozymisArLegalus;
        this.papildomaInfoIslaidu = papildomaInfoIslaidu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataIslaidu() {
        return dataIslaidu;
    }

    public void setDataIslaidu(String dataIslaidu) {
        this.dataIslaidu = dataIslaidu;
    }

    public int getSumaIslaidu() {
        return sumaIslaidu;
    }

    public void setSumaIslaidu(int sumaIslaidu) {
        this.sumaIslaidu = sumaIslaidu;
    }

    public String getKategorijaIslaidu() {
        return kategorijaIslaidu;
    }

    public void setKategorijaIslaidu(String kategorijaIslaidu) {
        this.kategorijaIslaidu = kategorijaIslaidu;
    }

    public String getPozymisArLegalus() {
        return pozymisArLegalus;
    }

    public void setPozymisArLegalus(String pozymisArLegalus) {
        this.pozymisArLegalus = pozymisArLegalus;
    }

    public String getPapildomaInfoIslaidu() {
        return papildomaInfoIslaidu;
    }

    public void setPapildomaInfoIslaidu(String papildomaInfoIslaidu) {
        this.papildomaInfoIslaidu = papildomaInfoIslaidu;
    }
}
