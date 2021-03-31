package biudzeto_projektas_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * čia saugoma pajamų įrašo objekto informaciją
 */
public class PajamuIrasas extends Irasas {

    private String kategorijaPajamu;
    private String tipasPajamu;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy/MM/dd HH:mm]");

    public PajamuIrasas(long id, LocalDateTime dataPajamu, double sumaPajamu, String komentaras, String kategorijaPajamu, String tipasPajamu) {
        super(id, dataPajamu, sumaPajamu, komentaras);
        this.kategorijaPajamu = kategorijaPajamu;
        this.tipasPajamu = tipasPajamu;
    }

    public String getKategorijaPajamu() {
        return kategorijaPajamu;
    }

    public void setKategorijaPajamu(String kategorijaPajamu) {
        this.kategorijaPajamu = kategorijaPajamu;
    }

    public String getTipasPajamu() {
        return tipasPajamu;
    }

    public void setTipasPajamu(String tipasPajamu) {
        this.tipasPajamu = tipasPajamu;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (ob instanceof PajamuIrasas) {
            PajamuIrasas pi = (PajamuIrasas) ob;
            return (this.getId()) == (pi.getId());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pajamų įrašas { " + this.getId() + ". [" + this.getData().format(formatter) + "] Suma: " + this.getSuma() + " eur. \nKomentaras: " + this.getKomentaras() +
                "; Pajamų kategorija: " + kategorijaPajamu + "; Pajamų tipas: " + tipasPajamu + "; }";
    }
}
