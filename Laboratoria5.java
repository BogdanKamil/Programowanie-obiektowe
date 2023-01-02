public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(1, 2);
        Punkt p3 = new Punkt(-1, -2);
        p1.opis();
        Okrag okrag = new Okrag(new Punkt(1, 2), 3);
        double powierzchnia = okrag.getPowierzchnia();
        boolean punktWSrodku = okrag.wSrodku(new Punkt(1, 2));
    }
}             
------------------------------------------------------------------------------
public class Punkt
{
    public int x;
    public int y;

    public Punkt()
    {
        x = 0;
        y = 0;
    }

    public Punkt(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int xCoord)
    {
        x = xCoord;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int yCoord)
    {
        y = yCoord;
    }

    public void zeruj()
    {
        x = 0;
        y = 0;
    }

    public void opis()
    {
        System.out.println("Punkt o wspolrzednych (" + x + "," + y + ")");
    }

    public void przesun(int xCoord, int yCoord)
    {
        x += xCoord;
        y += yCoord;
    }
}
------------------------------------------------------------------------------
 class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    Figura(){
        punkt = new Punkt(0,0);
    }
    Figura(String kolor){
        this.kolor=kolor;
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    String getKolor(){
        return kolor;
    }
    String opis(){
        return "Klasa Figura. Kolor obiektu: "+kolor;
    }


}   
------------------------------------------------------------------------------
public class Okrag
{
    private Punkt srodek;
    private double promien;

    public Okrag()
    {
        srodek = new Punkt();
        promien = 0;
    }

    public Okrag(Punkt srodekOkregu, double promienOkregu)
    {
        srodek = srodekOkregu;
        promien = promienOkregu;
    }

    public double getPowierzchnia()
    {
        return Math.PI * promien * promien;
    }

    public double getSrednica()
    {
        return 2 * promien;
    }

    public void setPromien(double p)
    {
        promien = p;
    }

    public double getPromien()
    {
        return promien;
    }

    public boolean wSrodku(Punkt punkt)
    {
        double x = punkt.x - srodek.x;
        double y = punkt.y - srodek.y;
        return x * x + y * y <= promien * promien;
    }
}
------------------------------------------------------------------------------
  class Prostokat  {
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    double getPowierzchnia() {
        return (szer * wys);
    }


}  
------------------------------------------------------------------------------
    class Trojkat
{
    double wys=0, podst=0;

    Trojkat(double wys, double podst)
    {
        this.wys = wys;
        this.podst = podst;
    }

}
