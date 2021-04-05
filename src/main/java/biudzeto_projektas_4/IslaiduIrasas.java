package biudzeto_projektas_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * čia saugoma išlaidų įrašo objekto informaciją
 */
public class IslaiduIrasas extends Irasas {

    private String kategorijaIslaidu;
    private String tipasIslaidu;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy/MM/dd HH:mm]");

    public IslaiduIrasas(long id, LocalDateTime dataIslaidu, double sumaIslaidu, String komentaras, String kategorijaIslaidu, String tipasIslaidu) {
        super(id, dataIslaidu, sumaIslaidu, komentaras);
        this.kategorijaIslaidu = kategorijaIslaidu;
        this.tipasIslaidu = tipasIslaidu;
    }

    public String getKategorijaIslaidu() {
        return kategorijaIslaidu;
    }

    public void setKategorijaIslaidu(String kategorijaIslaidu) {
        this.kategorijaIslaidu = kategorijaIslaidu;
    }

    public String getTipasIslaidu() {
        return tipasIslaidu;
    }

    public void setTipasIslaidu(String tipasIslaidu) {
        this.tipasIslaidu = tipasIslaidu;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (ob instanceof IslaiduIrasas) {
            IslaiduIrasas ii = (IslaiduIrasas) ob;
            return (this.getId()) == (ii.getId());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Išlaidų įrašas { " + this.getId() + ". [" + this.getData().format(formatter) + "] Suma: " + this.getSuma() + " eur. \nKomentaras: " + this.getKomentaras() +
                "; Išlaidų kategorija: " + kategorijaIslaidu + "; Išlaidų tipas: " + tipasIslaidu + "; }";
    }
}
