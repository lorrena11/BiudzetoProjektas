package biudzeto_projektas_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("[yyyy/MM/dd HH:mm]");
        Date date = new Date();
        Biudzetas objP = new Biudzetas();
        Biudzetas objI = new Biudzetas();

        objP.pridetiPajamuIrasa("data", 10, "grynieji", "legalus", "info nebera"); // 0
        objP.pridetiPajamuIrasa( "data", 20,"grynieji", "nelegalus", "seneliu dovana"); // 1
        objI.pridetiIslaiduIrasa( "data", 200,"grynieji", "nelegalus", "seneliu dovana");

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
                    int suma = scanner.nextInt();
                    System.out.println("Iveskite kategorija: ");
                    String kategorija = scanner.next();
                    System.out.println("Ar legalus pinigai: ");
                    String legalumas = scanner.next();
                    System.out.println("Iveskite papildoma info: ");
                    String papildoma = scanner.next();
                    String data = formatter.format(date);
                    objP.pridetiPajamuIrasa(data, suma, kategorija, legalumas, papildoma);
                    break;
                case "-":
                    System.out.println("Iveskite islaidu suma: ");
                    int islaiduSuma = scanner.nextInt();
                    System.out.println("Iveskite islaidu kategorija: ");
                    String islaiduKategorija = scanner.next();
                    System.out.println("Ar juodi isleisti pinigai: ");
                    String islaiduLegalumas = scanner.next();
                    System.out.println("Iveskite papildoma islaidu info: ");
                    String islaiduPapildoma = scanner.next();
                    String islaiduData = formatter.format(date);
                    objI.pridetiIslaiduIrasa(islaiduData, islaiduSuma, islaiduKategorija, islaiduLegalumas, islaiduPapildoma);
                    break;
                case "i+":
                    System.out.println("Iveskite norima pajamu ID: ");
                    int pIndex = scanner.nextInt();
                    //PajamuIrasas objPajamos = objB.gautiPajamuIrasa(pIndex);
                    PajamuIrasas pi = objP.gautiPajamuIrasa(pIndex);

                    System.out.println("Suma: " + pi.getSumaPajamu());
                    System.out.println("Data: " + pi.getDataPajamu());
                    System.out.println("Kategorija: " + pi.getKategorijaPajamu());
                    System.out.println("Legalumas: " + pi.getPozymisArLegalus());
                    System.out.println("Papildoma info: " + pi.getPapildomaInfoPajamu());
                    break;
                case "i-":
                    System.out.println("Iveskite norima islaidu ID: ");
                    int iIndex = scanner.nextInt();
                    IslaiduIrasas ii = objI.gautiIslaiduIrasa(iIndex);

                    System.out.println("Suma: " + ii.getSumaIslaidu());
                    System.out.println("Data: " + ii.getDataIslaidu());
                    System.out.println("Kategorija: " + ii.getKategorijaIslaidu());
                    System.out.println("Legalumas: " + ii.getPozymisArLegalus());
                    System.out.println("Papildoma info: " + ii.getPapildomaInfoIslaidu());
                    break;
                    // todo: įdėti į antrą dalį
//                case "v":
//                    objB.spausdintiPajamas();
//                    objB.spausdintiIslaidas();
//                    break;
//                case "tp":
//                    System.out.println("Pateikiami visi pajamu irasai.");
//                    objB.spausdintiPajamas();
//                    System.out.println("Iveskite norima pajamu ID: ");
//                    int pID = scanner.nextInt();
//                    objB.trintiPajamuIrasa(pID);
//                    System.out.println("Istrinta.");
//                    break;
//                case "ti":
//                    System.out.println("Pateikiami visi islaidu irasai.");
//                    objB.spausdintiIslaidas();
//                    System.out.println("Iveskite norima islaidu ID: ");
//                    int iID = scanner.nextInt();
//                    objB.trintiIslaiduIrasa(iID);
//                    System.out.println("Istrinta.");
//                    break;
//                case "b":
//                    System.out.println(objB.balansas() + " eur");
//                    break;
                case "x":
                    System.out.println("Viso gero.");
                    runProgram = false;
                    break;
            }
        }
        scanner.close();
    }
}
