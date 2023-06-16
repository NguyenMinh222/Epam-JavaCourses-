package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_Three {
    /*Дана матрица. Выввести k-ю строку и p-й столбец матрицы.*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int m = isNum("m");
        int i, j;
        int[][] A = new int[n][m];

        Random rnd = new Random();

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextInt(-50, 50);
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        int k = col_row("Choose the number of row of matrix u want to display on screen k = ", n, "k");
        System.out.println("Row " + k + ": ");
        for (j = 0; j < m; j++){
            System.out.print(A[k - 1][j] + " ");
        }

        int p = col_row("\nChoose the number of column of matrix u want to display on screen p = ", m, "p");
        System.out.println("Column " + p + ": ");
        for(i = 0; i < n; i++){
            System.out.println(A[i][p - 1]);
        }
    }

    public static int col_row(String val, int x, String letter){
        while(true){

            System.out.print(val);
            String change_val = input.next();

            try{
                int temp = Integer.parseInt(change_val);
                if(temp <= 0 || temp >= x){
                    System.out.println("\"" + letter + "\" should be great than 0 and less then " + x);
                }else {
                    return Integer.parseInt(change_val);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data");
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
