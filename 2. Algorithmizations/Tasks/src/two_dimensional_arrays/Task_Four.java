package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_Four {
    /*Сформировать квадратную матрицу по образцу*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int i, j, k;
        int[][] A = new int[n][n];

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0, k = A[i].length; j < A[i].length; j++, k--){
                if(i % 2 == 0){
                    A[i][j] = j + 1;
                    System.out.printf("%5d", A[i][j]);
                }else{
                    A[i][j] = k;
                    System.out.printf("%5d", A[i][j]);
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
                if(temp <= 0 || temp % 2 != 0){
                    System.out.println("Input a positive even value more than 0.");
                }else {
                    return Integer.parseInt(x);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data");
            }
        }
    }
}
