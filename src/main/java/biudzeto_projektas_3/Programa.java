package biudzeto_projektas_3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    private static long idpajamos = 0;
    private static long idislaidos = 0;

    public static void main(String[] args) {
        Biudzetas objB = new Biudzetas();
        List<Irasas> sablonai = IrasaiGenerator.generate();
        for (Irasas irasas : sablonai) {
            objB.pridetiIrasa(irasas);
            if (irasas instanceof PajamuIrasas) {
                idpajamos++;
            } else if (irasas instanceof IslaiduIrasas) {
                idislaidos++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;

        while (runProgram) {
            System.out.println("**********************************************");
            System.out.println("Pasirinkite ka norite daryti: ");
            System.out.println(
                            "[v] - visi irasai; [-] - ivesti islaidas; [+] - ivesti pajamas; \n" +
                            "[tp] ar [ti] - trinti irasa; [i+] ar [i-] - perziuret kuri nors pajamu ar islaidu irasa; \n" +
                            "[r] - redaguoti kurį nors įrašą; [b] - balansas; [x] - iseiti.");
            System.out.println("**********************************************");
            String komanda = scanner.next();
            switch (komanda) {
                case "+":
                    boolean vedaPajamas = true;
                    while (vedaPajamas) {
                        try {
                            System.out.println("Iveskite suma: ");
                            double suma = scanner.nextDouble();
                            System.out.println("Iveskite kategorija: ");
                            String kategorija = scanner.next();
                            System.out.println("Pajamų tipas: ");
                            String tipas = scanner.next();
                            System.out.println("Įveskite komentarą: ");
                            String komentaras = scanner.next();
                            objB.pridetiIrasa(new PajamuIrasas(idpajamos, LocalDateTime.now(), suma, komentaras, kategorija, tipas));
                            idpajamos++;
                            vedaPajamas = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Netinkamai įvestos pajamos");
                            scanner.next();
                        }
                    }
                    break;
                case "-":
                    boolean vedaIslaidas = true;
                    while (vedaIslaidas) {
                        try {
                            System.out.println("Iveskite islaidu suma: ");
                            double islaiduSuma = scanner.nextDouble();
                            System.out.println("Iveskite islaidu kategoriją: ");
                            String islaiduKategorija = scanner.next();
                            System.out.println("Išlaidų tipas: ");
                            String islaiduTipas = scanner.next();
                            System.out.println("Įveskite komentarą: ");
                            String islaiduKomentaras = scanner.next();
                            objB.pridetiIrasa(new IslaiduIrasas(idislaidos, LocalDateTime.now(), islaiduSuma, islaiduKomentaras, islaiduKategorija, islaiduTipas));
                            idislaidos++;
                            vedaIslaidas = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Netinkamai įvestos išlaidos");
                            scanner.next();
                        }
                    }
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
                case "r":
                    System.out.println("Redaguoti pajamas [1] ar išlaidas [2]?");
                    int whichOne = scanner.nextInt();
                    if (whichOne == 1) {
                        System.out.println("================== Pajamos =======================");
                        List<PajamuIrasas> rpajamos = objB.spausdintiPajamas();
                        rpajamos
                                .forEach(System.out::println);
                        System.out.println("Pasirinkite norimo redaguoti įrašo id: ");
                        int choice = scanner.nextInt();
                        Irasas beingEdited = objB.gautiPajamuIrasa(choice);
                        objB.atnaujintiIrasa(beingEdited);
                    } else if (whichOne == 2) {
                        System.out.println("================== Išlaidos =======================");
                        List<IslaiduIrasas> rislaidos = objB.spausdintiIslaidas();
                        rislaidos
                                .forEach(System.out::println);
                        System.out.println("Pasirinkite norimo redaguoti įrašo id: ");
                        int choice = scanner.nextInt();
                        Irasas beingEdited = objB.gautiIslaiduIrasa(choice);
                        objB.atnaujintiIrasa(beingEdited);
                    }
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
