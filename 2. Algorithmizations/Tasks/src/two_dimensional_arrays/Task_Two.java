package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_Two {
    /*Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int i, j;
        int[][] A = new int[n][n];

        Random rnd = new Random();

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextInt(-100, 100);
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        String spaces = "";
        System.out.println("\nDiagonal elements of matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
               if(i == j) {
                   System.out.printf(spaces + "%5d", A[i][j]);
                   spaces += "     ";
               }
            }
            System.out.println();
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
