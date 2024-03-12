import java.util.Scanner;

public class feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szo: ");
        String szo = sc.nextLine();

        StringBuilder modositottString = new StringBuilder();
        for (int i = 0; i < szo.length(); i++) {
            char szoChar = szo.charAt(i);
            if (szoChar == 'a') {
                modositottString.append("*");
            } else {
                modositottString.append(szoChar);
            }
        }
        System.out.println(modositottString);
    }
}
