import java.util.Scanner;

public class feladat4 {
    public static String stringkiiratas(String input) {
        StringBuilder string = new StringBuilder();
        int db = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                db++;
            } else {
                string.append(input.charAt(i)).append(db);
                db = 1;
            }
        }

        string.append(input.charAt(input.length() - 1)).append(db);

        return string.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adj meg egy karakterláncot: ");
        String eredmeny = sc.nextLine();

        System.out.println(stringkiiratas(eredmeny));
    }
}
