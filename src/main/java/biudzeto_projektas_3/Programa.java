package biudzeto_projektas_3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    private static long pajamosId = 3L;
    private static long islaidosId = 2L;

    public static void main(String[] args) {
        Biudzetas objB = new Biudzetas();
        List<Irasas> sablonai = IrasaiGenerator.generate();
        for (Irasas irasas : sablonai) {
            objB.pridetiIrasa(irasas);
        }

        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Pasirinkite ka norite daryti: ");
            System.out.println(
                    "[v] - visi irasai; [-] - ivesti islaidas; [+] - ivesti pajamas; [tp] ar [ti] - trinti irasa; [i+] ar [i-] - perziuret kuri nors pajamu ar islaidu irasa; [b] - balansas; [x] - iseiti.");
            String komanda = scanner.next();
            switch (komanda) {
                case "+":
                    System.out.println("Iveskite suma: ");
                    double suma = scanner.nextDouble();
                    System.out.println("Iveskite kategorija: ");
                    String kategorija = scanner.next();
                    System.out.println("Pajamų tipas: ");
                    String tipas = scanner.next();
                    System.out.println("Įveskite komentarą: ");
                    String komentaras = scanner.next();
                    objB.pridetiIrasa(new PajamuIrasas(pajamosId, LocalDateTime.now(), suma, komentaras, kategorija, tipas));
                    pajamosId++;
                    break;
                case "-":
                    System.out.println("Iveskite islaidu suma: ");
                    int islaiduSuma = scanner.nextInt();
                    System.out.println("Iveskite islaidu kategoriją: ");
                    String islaiduKategorija = scanner.next();
                    System.out.println("Išlaidų tipas: ");
                    String islaiduTipas = scanner.next();
                    System.out.println("Įveskite komentarą: ");
                    String islaiduKomentaras = scanner.next();
                    objB.pridetiIrasa(new IslaiduIrasas(islaidosId, LocalDateTime.now(), islaiduSuma, islaiduKomentaras, islaiduKategorija, islaiduTipas));
                    islaidosId++;
                    break;
                case "i+":
                    System.out.println("Įveskite norimą pajamų ID: ");
                    int pIndex = scanner.nextInt();
                    PajamuIrasas pi = objB.gautiPajamuIrasa(pIndex);
                    System.out.println(pi.toString());
                    break;
                case "i-":
                    System.out.println("Įveskite norimą išlaidų ID: ");
                    int iIndex = scanner.nextInt();
                    IslaiduIrasas ii = objB.gautiIslaiduIrasa(iIndex);
                    System.out.println(ii.toString());
                    break;
                case "v":
                    System.out.println("================== Pajamos =======================");
                    List<PajamuIrasas> pajamos = objB.spausdintiPajamas();
                    pajamos
                            .forEach(System.out::println);
                    System.out.println("================== Išlaidos =======================");
                    List<IslaiduIrasas> islaidos = objB.spausdintiIslaidas();
                    islaidos
                            .forEach(System.out::println);
                    break;
                case "tp":
                    System.out.println("================== Visi pajamų įrašai =======================");
                    List<PajamuIrasas> tpajamos = objB.spausdintiPajamas();
                    tpajamos
                            .forEach(System.out::println);
                    System.out.println("Įveskite norimą pajamų ID: ");
                    int pID = scanner.nextInt();
                    objB.trintiPajamuIrasa(pID);
                    System.out.println("Ištrinta.");
                    break;
                case "ti":
                    System.out.println("================== Visi išlaidų įrašai =======================");
                    List<IslaiduIrasas> tislaidos = objB.spausdintiIslaidas();
                    tislaidos
                            .forEach(System.out::println);
                    System.out.println("Įveskite norimą išlaidų ID: ");
                    int iID = scanner.nextInt();
                    objB.trintiIslaiduIrasa(iID);
                    System.out.println("Ištrinta.");
                    break;
                case "b":
                    System.out.println(objB.balansas() + " eur");
                    break;
                case "x":
                    System.out.println("Viso gero.");
                    runProgram = false;
                    break;
            }
        }
        scanner.close();
    }
}
