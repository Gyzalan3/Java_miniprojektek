package Miniprojekt_1hazi;
import java.util.Scanner;
public class feladat3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg az első számot: ");
        double szam1 = sc.nextDouble();

        System.out.print("Kérem adja meg az második számot: ");
        double szam2 = sc.nextDouble();

        int operator_lehetoseg = 0;
        System.out.println("\nEnter 1 és Összeadás"); //addition
        System.out.println("Enter 2 és Kivonás"); // subtraction
        System.out.println("Enter 3  és Szorzás"); // multiplication
        System.out.println("Enter 4 és Osztás"); // division
        System.out.println("Enter 5 és Kilépés"); // Exit

        System.out.print("\nVálassz egy műveletet: ");
        operator_lehetoseg = sc.nextInt();

        double eredmeny = 0.0;


        if (1 <= operator_lehetoseg && operator_lehetoseg <= 5) {
             if (operator_lehetoseg == 1) {
                eredmeny = szam1 + szam2;
            }

            else if (operator_lehetoseg == 2) {
                eredmeny = szam1 - szam2;
            }

            else if (operator_lehetoseg == 3) {
                eredmeny = szam1 * szam2;
            }

            else if (operator_lehetoseg == 4) {
                eredmeny = szam1 / szam2;
            }

            else if (operator_lehetoseg == 5) {
                System.out.println("Kilépés!");
                return;
            }

            //kiíratás eredmény csak akkor megy, ha 1-5 között van a választás
            System.out.println("\nEredmény: " + eredmeny);
        }
        else {
            System.out.println("Hibás választás!");
        }

    }
}

