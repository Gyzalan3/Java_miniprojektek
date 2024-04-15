import java.util.ArrayList;

public class Teszt {
    public static void main(String[] args) throws Bankszamla.SajatHibaException {
        RegularisSzamla szemely1= new RegularisSzamla(800,"Gyorfi Zalan",1);
        RegularisSzamla szemely1_1= new RegularisSzamla(800,"Gyorfi Helga",4);
        FolyoSzamla szemely2= new FolyoSzamla(1500,"Jakab Anna",2);
        FolyoSzamla szemely2_1= new FolyoSzamla(1500,"Jakab Arpi",2);
        TakarekSzamla szemely3= new TakarekSzamla(5000,"Szeja Hortenia",3,200);

        try {
            szemely1.betesz(177);
            szemely1_1.kivesz(60);
            szemely1.kivesz(1000);
            szemely2.betesz(300);
            szemely2.kivesz(100);
            szemely2.levonKoltseg();
            szemely3.hozzaadKamat();


        }catch (Bankszamla.SajatHibaException e){
            System.out.println("Nincs elég összeg a számlán.");
        }
        System.out.println(szemely1);
        System.out.println(szemely1_1);
        System.out.println(szemely2);
        System.out.println(szemely2_1);
        System.out.println(szemely3);
        System.out.println(szemely2_1.equals(szemely2));

        for (Tranzakcio i : szemely1_1.tranzakciok){
            if(i.tranzTipus== Tranzakcio.TranzakcioTipus.DEPOSIT){
                System.out.println("Deposit: "+i.toString());
            }
        }
    }
}
