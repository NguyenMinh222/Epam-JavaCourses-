package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_Ten {
    /*Найти положительные элементы главной диагонали квадратной матрицы */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int i, j, count = 0;
        int[][] A = new int[n][n];
        Random rnd = new Random();

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextInt(-1000, 1000);
                System.out.printf("%12d", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("Positive elements of the main diagonal of the square matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                if(i == j && A[i][j] > 0){
                    System.out.println("A[" + i + "][" + j + "] = " + A[i][j]);
                }
            }
        }
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
