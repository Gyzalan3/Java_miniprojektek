public class feladat7 {
    public static void main(String[] args) {
        int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9};
        int n = tomb.length;
        tobbszorosKiiras(tomb, n);
        System.out.println();
        System.out.println("\nEredeti tomb: ");
        for (int i : tomb) {
            System.out.print(i + " ");
        }
    }

    public static void tobbszorosKiiras(int[] tomb, int tomb_meret) {
        for (int i = 0; i < tomb_meret; i++) {
            int count = 0;
            for (int j = 0; j < tomb_meret; j++) {
                if (tomb[i] == tomb[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print("\nTobbszoros: "+tomb[i]);

            }
        }
    }
}



