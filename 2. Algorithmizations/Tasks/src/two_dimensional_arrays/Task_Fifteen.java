package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_Fifteen {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int m = isNum("m");
        int n = isNum("n");
        int i, j, max = 0;
        int[][] A = new int[m][n];
        Random rnd = new Random();

        System.out.println("Source matrix:");
       for(j = 0; j < A[0].length; j++){
           for (i = 0; i < A.length; i++) {
               A[i][j] = rnd.nextInt(0, 101);
               if(A[i][j] > max){
                   max = A[i][j];
               }
               System.out.printf("%5d", A[i][j]);
           }
           System.out.println();
       }

       System.out.println("\nNew matrix:");
        for(j = 0; j < A[0].length; j++){
            for (i = 0; i < A.length; i++) {
                if(A[i][j] % 2 != 0){
                    A[i][j] = max;
                }
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }

    public static int isNum(String letter){
        while(true){
            System.out.print("Input a value for " + letter + " = ");
            String value = input.next();

            try{
                if(Integer.parseInt(value) <= 0){
                    System.out.println("A value should be positive and great than 0!");
                }else{
                    return Integer.parseInt(value);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect data");
            }
        }
    }
}
