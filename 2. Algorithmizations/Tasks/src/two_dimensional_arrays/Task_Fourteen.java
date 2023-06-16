package two_dimensional_arrays;

import java.awt.desktop.SystemSleepEvent;
import java.util.Random;
import java.util.Scanner;

public class Task_Fourteen {
    /*Сформировать случайную матрицу mxn состоящую из нулей и единиц, причем
    * в каждом столбце число единиц равно номеру столбца.*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int m = isNum("m");
        int n = isNum("n");

        while (m < n){
            System.out.println("m cannot ne great than n.");
            m = isNum("m");
        }

        int i, j, count = 0;
        int[][] A = new int[m][n];
        Random rnd = new Random();

       for(j = 0; j < A[0].length; j++){
           count = 0;
           for (i = 0; i < A.length; i++) {
               A[i][j] = rnd.nextInt(0, 2);
               if(A[i][j] == 1){
                   count++;
               }
           }

           while(true){
               if(count == j){
                   break;
               }
               else {
                   for (i = 0; i < A.length; i++) {
                       A[i][j] = rnd.nextInt(0, 2);
                       if(A[i][j] == 1){
                           count++;
                       }
                   }
               }
           }
       }

       for(i = 0; i < A.length; i++){
           for(j = 0; j < A[i].length; j++){
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
