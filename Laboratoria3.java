import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  zadanie1();
        //  zadanie2();
        //  zadanie3();
        //  zadanie4();
        //  zadanie5();
        zadanie6();
    }

    //Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for.
    public static void zadanie1() {
        Random generator = new Random();
        int[] tablica = new int[10];
        int suma = 0, zmienna, srednia;
        for (int i = 0; i < tablica.length; i++) {
            zmienna = generator.nextInt(10) + 1;
            tablica[i] = zmienna;
            System.out.println("Tablica -" + "  " + tablica[i]);
            suma += zmienna;
        }
        srednia = suma / 10;
        System.out.println("Suma rowna sie =" + suma);
        System.out.println("Srednia rowna sie =" + srednia);
    }

    // Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic.
    // Pierwsza tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.
    public static void zadanie2() {
        int[] tablicap = {0, 2, 4, 6, 8, 10};
        int[] tablican = {1, 3, 5, 7, 9};
        for (int i = 0; i < 5; i = i + 2) {
            System.out.println(tablicap[i]);
            System.out.println(tablican[i]);
        }
    }

    // Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją przykładowymi wartościami.
    //Skorzystaj z pętli for-each, aby wypisać wszystkie wartości tablicy ze wszystkimi literami zamienionymi na wielkie.
    // Skorzystaj z funkcjonalności toUpperCase wartości typu String, którą poznaliśmy już w jednym z poprzednich rozdziałów.
    public static void zadanie3() {
        String[] slowa;
        slowa = new String[]{"Ala", "ma", "kota"};
        for (String i : slowa)
            System.out.print(i.toUpperCase());

    }

    //Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy.
    // Następnie, program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami zapisanymi od końca do początku.
    // Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i","psa"
    // program powinien wypisać: "asp", "i", "atok", "am", "alA"
    public static void zadanie4() {

        Scanner scan = new Scanner(System.in);
        String[] slowa = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj slowo :) ");
            slowa[i] = scan.nextLine();
        }
        for (int i = 4; i >= 0; i--) {
            String reverse = new StringBuffer(slowa[i]).reverse().toString();
            System.out.print(reverse + ' ');
        }
    }

    //Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
    //posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran.
    // Dla przykładu, dla liczb 10,-2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100.
    // Zastanów się, jak można posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie.
    //Przetestuj je na różnych zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów sortowania,
    // np. sortowania przez wstawianie. Działanie algorytmu omówiono szczegółowo na zajęciach algorytmy i struktury danych.
    public static void zadanie5() {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe :");
            int liczb = scan.nextInt();
            tab[i] = liczb;
        }
        System.out.println("Elementy Tablicy :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Posortowane :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    //  Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy,
    //  a następnie policzy i wypisze silnię każdej z pobranych liczb
    public static void zadanie6() {
        Scanner scan = new Scanner(System.in);
        int[] tablica = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbe z ktorej oblicze Silnie :) :");
            tablica[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int n = tablica[i];
            int silnia = 1;
            for (int j = 1; j <= n; j++) {
                silnia *= j;
            }
            System.out.println("Silnia z " + tablica[i] + " rownia sie = " + silnia);
        }
    }
}
