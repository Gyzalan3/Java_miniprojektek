public class feladat6 {
    public static void main(String[] args) {
        int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = keresMin(tomb);
        int max = keresMax(tomb);
        System.out.println("Min: " + min);
        System.out.println("\nMax: " + max);
    }

    public static int keresMin(int[] tomb1) {
        int min = tomb1[0];
        for (int i = 1; i < tomb1.length; i++) {
            if (tomb1[i] < min) {
                min = tomb1[i];
            }
        }
        return min;
    }

    public static int keresMax(int[] tomb1) {
        int max = tomb1[0];
        for (int i = 1; i < tomb1.length; i++) {
            if (tomb1[i] > max) {
                max = tomb1[i];
            }
        }
        return max;
    }
}

