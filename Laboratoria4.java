//klasa prostokat
public class Prostokat {
    // atrybuty klasy
    private double dlugosc;
    private double szerokosc;

    // konstruktor klasy
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    // metody klasy
    public double obliczPole() {
        return dlugosc * szerokosc;
    }

    public double obliczObwod() {
        return 2 * (dlugosc + szerokosc);
    }
  
  
  
//main
public class Main {
    public static void main(String[] args) {

       zadanie1();

    }
    public static void zadanie1()
    {
        // utworzenie obiektów klasy Prostokat
        Prostokat prostokat1 = new Prostokat(4, 5);
        Prostokat prostokat2 = new Prostokat(6, 7);

        // wywołanie metod klasy Prostokat
        double pole1 = prostokat1.obliczPole();
        double obwod1 = prostokat1.obliczObwod();
        double przekatna1 = prostokat1.obliczPrzekatna();

        double pole2 = prostokat2.obliczPole();
        double obwod2 = prostokat2.obliczObwod();
        double przekatna2 = prostokat2.obliczPrzekatna();

        // wypisanie wyników na ekranie
        System.out.println("Prostokąt 1:");
        System.out.println("Pole: " + pole1);
        System.out.println("Obwód: " + obwod1);
        System.out.println("Przekątna: " + przekatna1);
        System.out.println();

        System.out.println("Prostokąt 2:");
        System.out.println("Pole: " + pole2);
        System.out.println("Obwód: " + obwod2);

    }
}
