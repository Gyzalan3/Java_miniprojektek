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
        int [] array1={0,10,23,30};
        int [] array2={0,10,20,30};

        System.out.println("Array1 és Array2 egyenlőek: " + ellenorzes(array1,array2));

    }

}

