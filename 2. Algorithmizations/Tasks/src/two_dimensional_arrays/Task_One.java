package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_One {
    /*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
    * больше последнего*/
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
                A[i][j] = rnd.nextInt(-20, 20);
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("Odd columns, where the first element is great than last element:");
        for(j = 0; j < m; j++){
            if((j % 2 != 0) && (A[0][j] > A[n - 1][j])){
                System.out.print((j + 1) + ". ");
                for(i = 0; i < A.length; i++){
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
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
