package Java_miniprojektek;

public class feladat1 {
    public static void main(String[] args) {
        int n;
        int i;
        n = 8;
        for (i = 1; i <= 10; i++) {
            if (n >= 1 && n <= 10) {
                System.out.println(i + "*" + n + "=" + (n * i));
            }
            else {
                System.out.print("Hiba történt nem jó a szám, mivel nem 1 és 10 között van!");
                break;
            }
        }
    }
}
