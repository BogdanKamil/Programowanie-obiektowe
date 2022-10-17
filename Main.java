import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println();
        Scanner in = new Scanner(System.in);
         zadanie2();
         zadanie3();
         zadanie4();
         zadanie5();
         zadanie6();
         zadanie7();
    }

    //metody zadanie1
    public static String getName() {
        return "Kamil";
    }
    public static int getAge() {
        return 21;
    }
    //zadanie2
    public static void zadanie2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a= ");
       int a = in.nextInt();
        System.out.println("Podaj b= ");
        int b = in.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    //zadanie 3
    public static void zadanie3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe aby sprawdzic czy jest parzysta : ");
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Ta liczba jest parzysta:");
        } else {
            System.out.println("ta liczba jest nie parzysta");
        }
    }
    //zadanie 4
    public static void zadanie4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe sprawdze czy jest podzielna przez 3 i 5 :");
        boolean enabled=true;
        boolean disabled=false;
        int a=in.nextInt();
        if(a%3==0 && a%5==0)
            System.out.println(enabled);
        else System.out.println(disabled);
    }
    //zadanie 5
    public static void zadanie5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe a podniose ja do 3 potegi");
        double a= in.nextDouble();
        double wynik=Math.pow(a,3);
        System.out.println(wynik);

    }
    //zadanie 6
    public static void zadanie6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe a podam ci jej pierwiastek kwadratowy");
        double a = in.nextDouble();
        double wynik = Math.sqrt(a);
        System.out.println(wynik);
    }
    //zadanie 7
    public static void zadanie7() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj poczatek przedzialu :");
        int a = in.nextInt();
        System.out.println("Podaj koniec przedzialu :");
        int b = in.nextInt();
        int wylosowana= rand.nextInt((b-a+1)+a);
        System.out.println(wylosowana);
    }
}
