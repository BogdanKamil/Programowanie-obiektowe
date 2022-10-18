import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(czyPalindrom("12321"));
    }
    public static double Input(){
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj n:");
        double n = input.nextDouble();
        return n;
    }

    public static void zadanie1(){
        double ilStud=Input();
        double suma=0,pkt;
        int ile=0,a=0,b=40;
        if(ilStud>0){
            while(ilStud>0){
                System.out.println("Podaj lp. pkt 0-40");
                pkt=Input();
                if(pkt>=a&&pkt<=b){
                    suma+=pkt;
                    ile++;
                    ilStud--;
                }
                else System.out.println("Bledna wartosc");
            }
            System.out.println("ile: "+ ile);
            System.out.println("Suma pkt="+ suma);
            System.out.println("Srednia= "+suma/ile);

        }else System.out.println("Grupa musi liczyc co najmniej 1 studenta");
    }
    public static void zadanie2(){
        double suma=0;
        int sumad=0,sumau=0,iledot=0,ileu=0;
        for (int i = 0; i < 10; i++) {
            double liczba=Input();
            if(liczba<0)
            {
                sumau+=liczba;
                ileu++;
            }
            else {
                sumad += liczba;
                iledot++;
            }
        }
        System.out.println("Suma dodatnich liczb "+ sumad+" ilosc dodatnich liczb "+iledot);
        System.out.println("Suma ujemnych liczb "+ sumau+" ilosc ujemnych liczb "+ileu);
    }
    public static void zadanie3(){
        double n=Input();
        double liczba = 0,suma=0;
        if(n>0){
            while(n>0){
            liczba=Input();
            if(liczba%2==0) suma+=liczba;
            n--;
            }
        }else System.out.println("System musi miec co najmniej 1 liczbe");
        System.out.println("Suma liczb parzystych = "+suma);
    }

    public static void zadanie4(){
        double n=Input();
        double suma=0;
        int liczba=0;

        Random rand= new Random();

        if(n>0){
            while(n>0){
                liczba=rand.nextInt(56)-10;
                System.out.println("wylosowana: "+liczba);
                if(liczba%2==0) suma+=liczba;
                n--;
            }
        }else System.out.println("System musi miec co najmniej 1 liczbe");
        System.out.println("Suma liczb parzystych = "+suma);
    }
    public static boolean czyPalindrom(String text){
        int end = text.length()-1;
        text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length()/2; i++) {
            if(text.charAt(i) !=text.charAt(end)) return false;
            end--;
        }
        return true;
    }
}
