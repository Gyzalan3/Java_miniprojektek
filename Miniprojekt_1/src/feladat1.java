package Miniprojekt_1hazi;
import java.util.Scanner;

public class feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Kérem adja meg a számot: ");
        int szam = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            if (szam >= 1 && szam <= 10) {
                System.out.println(szam + "*" + i + "=" + (szam * i));
            }
            else {
                System.out.print("Hiba történt, nem jó a szám, mivel nem 1 és 10 között van!");
                break;
            }
        }
    }
}
