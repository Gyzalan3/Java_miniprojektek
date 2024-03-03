package Miniprojekt_1hazi;
import java.util.Scanner;

public class feladat2 {
    public static boolean jelszoEllenorzo(String helyesJelszo, int probalkozasok) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nKérem adja meg a jelszót: ");
            String beirtJelszo = sc.nextLine();

            if (beirtJelszo.equals(helyesJelszo)) {
                return true;
            } else {
                probalkozasok--;
                System.out.println("Hibás jelszó! Még " + probalkozasok + " próbálkozás lehetséges!");
            }

        } while (probalkozasok > 0);

        return false;
    }
    public static void main(String[] args) {

        String helyesJelszo = "almafa"; //jelszó
        int probalkozasok = 3;

        boolean sikeresBelepes = jelszoEllenorzo(helyesJelszo, probalkozasok);

        if (sikeresBelepes) {
            System.out.println("Sikeres belépés!");
        } else {
            System.out.println("\nHárom sikertelen próbálkozás után leállt a program.");
        }
    }

}
