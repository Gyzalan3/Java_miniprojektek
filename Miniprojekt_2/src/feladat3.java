import java.util.Scanner;

public class feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szo: ");
        String szo = sc.nextLine();
        String ujszo = "";


        for (int i = 0; i < szo.length(); i++) {
            char szoChar = szo.charAt(i);
            if (ujszo.indexOf(szoChar) < 0) {
                ujszo += String.valueOf(szoChar);

            }
            System.out.println(ujszo);
        }
    }
}

