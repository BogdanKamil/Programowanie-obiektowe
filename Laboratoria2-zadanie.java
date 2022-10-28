import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        zadanie1();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
    }

    public static void zadanie1() {
        Scanner scan = new Scanner(System.in);
        double delta, pdelta, m1, m2;
        System.out.println("Podaj a= ");
        int a = scan.nextInt();
        System.out.println("Podaj b= ");
        int b = scan.nextInt();
        System.out.println("Podaj c= ");
        int c = scan.nextInt();
        delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Delta rowna sie = " + delta);
        pdelta = Math.sqrt(delta);
        System.out.println("Pierwiastek z delty =" + pdelta);
        if (delta < 0) System.out.println("To nie mozliwe, sprobuj jeszcze raz :)");
        else if (delta == 0) {
            m1 = (-b) / (2 * a);
            System.out.println("Jedno miejsce zerowe = ");
        } else {
            m1 = (-b - pdelta) / (2 * a);
            m2 = (-b + pdelta) / (2 * a);
            System.out.println("Mamy dwa miejsca zerowe : ");
            System.out.println("Pierwsze miejsce to " + m1);
            System.out.println("Drugie miejsce to " + m2);
        }
    }

    public static void zadanie3() {
        Scanner scan = new Scanner(System.in);
        int x, y, z, pom1, pom2, pom3, pom4;
        System.out.println("Podaj x :");
        x = scan.nextInt();
        System.out.println("Podaj y :");
        y = scan.nextInt();
        System.out.println("Podaj z :");
        z = scan.nextInt();
        pom1 = Math.min(x, y);
        pom2 = Math.min(pom1, z);
        System.out.println("Najmniejsza liczba to " + pom2);
        pom3 = Math.max(x, y);
        pom4 = Math.max(pom3, z);
        if ((pom2 == x && pom4 == y) || (pom2 == y && pom4 == x)) System.out.println("Srodkowa liczba to " + z);
        else if ((pom2 == x && pom4 == z) || (pom2 == z && pom4 == x)) System.out.println("Srodkowa liczba to " + y);
        else if ((pom2 == y && pom4 == z) || (pom2 == z && pom4 == y)) System.out.println("Srodkowa liczba to " + x);
        System.out.println("Najwieksza liczba to " + pom4);

    }

    public static void zadanie4() {
        boolean pada, autobus;
        boolean enabled = true;
        boolean disabled = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Czy pada deszcz?(true or false)");
        pada = scan.nextBoolean();
        System.out.println("Czy jest autobus na przystanku?(true or false)");
        autobus = scan.nextBoolean();
        if (pada == true && autobus == true) {
            System.out.println("Wez parasol");
            System.out.println("Dostaniesz sie na uczelnie");
        } else if (pada == true && autobus == false) {
            System.out.println("Nie dostaniesz sie na uczelnie");
        } else if (pada == false && autobus == true) {
            System.out.println("Dostaniesz sie na uczelnie");
            System.out.println("Milego dnia i pieknej pogody");
        }
    }

    public static void zadanie5() {
        Scanner scan = new Scanner(System.in);
        boolean znizka, podwyzka;
        boolean enabled = true;
        boolean disabled = false;
        System.out.println("Czy jest znizka na samochud?(true or false)");
        znizka = scan.nextBoolean();
        System.out.println("Czy dostales podwyzke?(true or false)");
        podwyzka = scan.nextBoolean();
        if ((znizka != true) || (podwyzka == true)) {
            System.out.println("Mozesz kupic samochod");
            System.out.println("Znizki na samochod nie ma");
        } else if ((znizka == false) || (podwyzka != true)) {
            System.out.println("Zakup samochód trzeba odłożyć na póżniej...");
            System.out.println("Znizki na samochód nie ma");
        } else if ((znizka == true) || (podwyzka == true)) {
            System.out.println("Mozesz kupic samochod");
        }
    }

    public static void zadanie6() {
        Scanner scan = new Scanner(System.in);
        int x, y, liczba;
        System.out.println("Podaj pierwsza liczbe : ");
        x = scan.nextInt();
        System.out.println("Podaj druga liczbe : ");
        y = scan.nextInt();
        System.out.println("Podaj co chcesz z nimi zrobić.");
        System.out.println("1 - DODAWANIE ");
        System.out.println("2 - ODEJMOWANIE");
        System.out.println("3 - ILOCZYN");
        System.out.println("4 - ILORAZ");
        System.out.println("5 - RESZTA Z DZIELENA");
        System.out.println("6 - WSZYSTKO");
        liczba = scan.nextInt();
        if (liczba == 1) System.out.println(x + "+" + y + "=" + (x + y));
        else if (liczba == 2) System.out.println(x + "-" + y + "=" + (x - y));
        else if (liczba == 3) System.out.println(x + "*" + y + "=" + (x * y));
        else if (liczba == 4) System.out.println(x + "/" + y + "=" + (x / y));
        else if (liczba == 5) System.out.println(x + "%" + y + "=" + (x % y));
        else if (liczba == 6) {
            System.out.println(x + "+" + y + "=" + (x + y));
            System.out.println(x + "-" + y + "=" + (x - y));
            System.out.println(x + "*" + y + "=" + (x * y));
            System.out.println(x + "/" + y + "=" + (x / y));
            System.out.println(x + "%" + y + "=" + (x % y));
        } else System.out.println("Blad podano bledna liczbe :(");
    }
}
