package decomposition;

import java.util.Arrays;
import java.util.Random;

public class Task_Twp {
    public static void main(String[] args){

        Random rnd = new Random();
        int[] A = new int[4];

        //A = new int[]{24, 4, 8, 16};

        for(int i = 0; i < A.length; i++){
            A[i] = rnd.nextInt(101);
        }
        System.out.println("4 numbers: \n" + Arrays.toString(A));

        int temp_GCD = A[0];
        for(int i = 1; i < A.length; i++){
            temp_GCD = GCD(temp_GCD, A[i]);
        }

        System.out.println("\nGCD of 4 numbers is " + temp_GCD);
    }

    static int GCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return GCD(b, a % b);
        }
    }
}
