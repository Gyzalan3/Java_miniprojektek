import java.util.Scanner;

public class feladat4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg a csillagok számát: ");
        int csillagok_szama = sc.nextInt();

        for (int i = 1; i <= csillagok_szama; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}