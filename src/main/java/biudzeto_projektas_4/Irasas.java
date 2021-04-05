package biudzeto_projektas_4;

import java.time.LocalDateTime;

/**
 * čia saugoma įrašų bendra informacija
 */
public class Irasas {
    private long id;
    private double suma;
    private LocalDateTime data;
    private String komentaras;

    public Irasas(long id, LocalDateTime data, double suma, String komentaras) {
        this.id = id;
        this.suma = suma;
        this.data = data;
        this.komentaras = komentaras;
    }

    public long getId() {
        return id;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getKomentaras() {
        return komentaras;
    }

    public void setKomentaras(String komentaras) {
        this.komentaras = komentaras;
    }
}
