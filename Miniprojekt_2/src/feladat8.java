public class feladat8 {

    public static void main(String[] args) {
        int[] tomb = {7, 3, 8, 1, 2, 5, 6, 4};
        System.out.println("Alap tomb: ");
        for (int i : tomb) {
            System.out.print(i + " ");
        }
        rendezTomb(tomb);
        System.out.println("\nSorrend: ");
        for (int i : tomb) {
            System.out.print(i + " ");
        }

    }

    private static void rendezTomb(int[] tomb) {
        int n = tomb.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int temp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = temp;
                }
            }
        }
    }
}
