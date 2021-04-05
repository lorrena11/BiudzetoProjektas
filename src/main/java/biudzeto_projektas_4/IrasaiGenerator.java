package biudzeto_projektas_4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * čia sugeneruojami keli įrašai sąrašo užpildymui
 */
public class IrasaiGenerator {

    static List<Irasas> generate() {
        List<Irasas> sablonai = new ArrayList<>();
        sablonai.add(new PajamuIrasas(0L, LocalDateTime.now(), 10, "komentaras", "kategorija", "tipas"));
        sablonai.add(new PajamuIrasas(1L, LocalDateTime.now(), 27.50, "komentarasss", "išmoka", "grynieji"));
        sablonai.add(new PajamuIrasas(2L, LocalDateTime.now(), 300, "komentuoju", "stipendija", "pavedimas"));
        sablonai.add(new IslaiduIrasas(0L, LocalDateTime.now(), 15.37, "apsiprekino", "maxima", "grynieji"));
        sablonai.add(new IslaiduIrasas(1L, LocalDateTime.now(), 200, "apsiprekino", "aliexpress", "pavedimas"));
        return sablonai;
    }
}
