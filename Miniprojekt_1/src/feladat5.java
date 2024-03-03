package Miniprojekt_1hazi;
public class feladat5 {
    private static boolean alfabetikus(String szoveg_str) {

        for (int i = 0; i < szoveg_str.length(); i++) {
            char helyes_str = szoveg_str.charAt(i);
            if (!Character.isLetter(helyes_str)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String szoveg = "Java programozas 2024";

        if (alfabetikus(szoveg)) {
            System.out.println("A string csak alfabetikus karaktereket tartalmaz.");
        } else {
            System.out.println("A string nem csak alfabetikus karaktereket tartalmaz.");
        }
    }
}
