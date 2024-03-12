public class feladat5 {
    public static void tombok(int[] tomb1) {

        int tomb2 = tomb1[0];
        if (tomb1.length >= 2) {
            tomb1[0] = tomb1[tomb1.length - 1];
            tomb1[tomb1.length - 1] = tomb2;
        }
    }

    public static void main(String[] args) {
        int[] tomb = {1, 3, 5, 7, 9};
        System.out.println("Csere előtt:");
        for (int i : tomb) {
            System.out.print(i + " ");
        }
        tombok(tomb);
        System.out.println("\nTömb elemei a csere után:");
        for (int i : tomb) {
            System.out.print(i + " ");
        }
    }
}
