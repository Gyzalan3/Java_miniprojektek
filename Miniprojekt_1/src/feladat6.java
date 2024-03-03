package Miniprojekt_1hazi;
import java.util.Arrays;

public class feladat6 {
      static boolean ellenorzes(int[] args1, int[] args2 ){
        if (Arrays.equals(args1, args2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] szam_tomb1={0,10,20,30};
        int [] szam_tomb2={0,10,20,30};

        System.out.println("Array1 és Array2 egyenlőek: " + ellenorzes(szam_tomb1,szam_tomb2));

    }

}

