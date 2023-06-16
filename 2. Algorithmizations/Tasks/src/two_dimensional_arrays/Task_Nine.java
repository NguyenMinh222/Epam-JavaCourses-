package two_dimensional_arrays;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Task_Nine {
    /*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
    * столбце. Определить какой столбец содержит максимальную сумму. */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int m = isNum("m");
        int i, j, count = 0;
        float[][] A = new float[n][m];
        Random rnd = new Random();

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextFloat(0, 100);
                System.out.printf("%12f", A[i][j]);
            }
            System.out.println();
        }

        float sum_col = 0, max_sum = 0;
        int max_col = 0;

        System.out.println("\nAll column sums:");
        for(j = 0; j < m; j++){
            for (i = 0; i < n; i++){
                sum_col += A[i][j];
            }

            if(sum_col > max_sum){
                max_sum = sum_col;
                max_col = j;
            }

            System.out.println(j + " " + sum_col);
            sum_col = 0;
        }

        System.out.println("\ncolumn number " + max_col + " contains the maximum amount: " + max_sum);
    }

    public static int isNum(String val){

        while(true){

            System.out.print("Input a value for " + val + " = ");
            String x = input.next();

            try{
                int temp = Integer.parseInt(x);
                if(temp <= 0){
                    System.out.println("Input a positive value more than 0.");
                }else {
                    return Integer.parseInt(x);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data");
            }
        }
    }
}
