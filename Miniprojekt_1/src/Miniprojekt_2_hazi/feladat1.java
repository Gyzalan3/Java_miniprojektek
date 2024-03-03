package Miniprojekt_2_hazi;

import java.util.Scanner;

public class feladat1 {
    static void beker(String args) {
        int i = args.length();
        char elso = args.charAt(0);
        char utolso = args.charAt(i - 1);
        System.out.println(elso);
        System.out.println(utolso);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A szo: ");
        String szo = sc.nextLine();
        beker(szo);
    }
}

