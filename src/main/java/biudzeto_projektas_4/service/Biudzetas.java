package biudzeto_projektas_4.service;

import biudzeto_projektas_4.model.Irasas;
import biudzeto_projektas_4.model.IslaiduIrasas;
import biudzeto_projektas_4.model.PajamuIrasas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * čia saugomas sarasas
 */
public class Biudzetas {
    private List<PajamuIrasas> pajamos = new ArrayList<>();
    private List<IslaiduIrasas> islaidos = new ArrayList<>();

    public void pridetiIrasa(Irasas irasas) {
        if (irasas instanceof PajamuIrasas) {
            pajamos.add((PajamuIrasas) irasas);
        } else if (irasas instanceof IslaiduIrasas) {
            islaidos.add((IslaiduIrasas) irasas);
        }
    }

    public PajamuIrasas gautiPajamuIrasa(int id) {
            return pajamos.get(id);
    }

    public IslaiduIrasas gautiIslaiduIrasa(int id) {
        return islaidos.get(id);
    }

    public PajamuIrasas trintiPajamuIrasa(int id) {
        return pajamos.remove(id);
    }

    public IslaiduIrasas trintiIslaiduIrasa(int id) {
        return islaidos.remove(id);
    }

    public List<PajamuIrasas> spausdintiPajamas() {
        return pajamos;
    }

    public List<IslaiduIrasas> spausdintiIslaidas() {
        return islaidos;
    }

    public double balansas() {
        double balansas;
        double pajamosSuma = 0;
        double islaidosSuma = 0;
        for (PajamuIrasas pajamuIrasas : pajamos) {
            pajamosSuma += pajamuIrasas.getSuma();
        }
        for (IslaiduIrasas islaiduIrasas : islaidos) {
            islaidosSuma += islaiduIrasas.getSuma();
        }
        balansas = pajamosSuma - islaidosSuma;

        return balansas;
    }

    public void atnaujintiIrasa(Irasas irasas) {
        Scanner scanner = new Scanner(System.in);

        for (PajamuIrasas pajamuIrasas : pajamos) {
            if (pajamuIrasas.equals(irasas)) {
                System.out.println("Suma: " + pajamuIrasas.getSuma());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    double newSuma = scanner.nextDouble();
                    pajamuIrasas.setSuma(newSuma);
                }
                System.out.println("Pajamų kategorija: " + pajamuIrasas.getKategorijaPajamu());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    String newKategorija = scanner.next();
                    pajamuIrasas.setKomentaras(newKategorija);
                }
                System.out.println("Pajamų tipas: " + pajamuIrasas.getTipasPajamu());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice3 = scanner.nextInt();
                if (choice3 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    String newTipas = scanner.next();
                    pajamuIrasas.setKomentaras(newTipas);
                }
                System.out.println("Komentaras: " + pajamuIrasas.getKomentaras());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice4 = scanner.nextInt();
                if (choice4 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    String newKomentaras = scanner.next();
                    pajamuIrasas.setKomentaras(newKomentaras);
                }
            }
        }

        for (IslaiduIrasas islaiduIrasas : islaidos) {
            if (islaiduIrasas.equals(irasas)) {
                System.out.println("Suma: " + islaiduIrasas.getSuma());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice1 = scanner.nextInt();
                if (choice1 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    double newSuma = scanner.nextDouble();
                    islaiduIrasas.setSuma(newSuma);
                }
                System.out.println("Išlaidų kategorija: " + islaiduIrasas.getKategorijaIslaidu());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    String newKategorija = scanner.next();
                    islaiduIrasas.setKategorijaIslaidu(newKategorija);
                }
                System.out.println("Išlaidų tipas: " + islaiduIrasas.getTipasIslaidu());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice3 = scanner.nextInt();
                if (choice3 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    String newTipas = scanner.next();
                    islaiduIrasas.setTipasIslaidu(newTipas);
                }
                System.out.println("Komentaras: " + islaiduIrasas.getKomentaras());
                System.out.println("[1] - redaguoti, [2] - toliau");
                int choice4 = scanner.nextInt();
                if (choice4 == 1) {
                    System.out.println("Įveskite naują reikšmę: ");
                    String newKomentaras = scanner.next();
                    islaiduIrasas.setKomentaras(newKomentaras);
                }
            }
        }
    }

}
