package two_dimensional_arrays;

import java.util.Scanner;

public class Task_Six {
    /*Сформировать квадратную матрицу порядка n по заданному образцу(n-четное)
    *   1 1 1 1 1 1
    0 1 1 1 1 0
    0 0 1 1 0 0
    0 0 1 1 0 0
    0 1 1 1 1 0
    1 1 1 1 1 1*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int i, j, k = 0, l = 0;
        int[][] A = new int[n][n];

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length / 2; i++){
            for(j = 0; j < A[i].length; j++){
                if((j < A[i].length - i) && (j >= i)){
                    A[i][j] = 1;
                }
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        for(i = A.length / 2; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                if((j > A[i].length - i - 2) && (j <= i)){
                    A[i][j] = 1;
                }
                System.out.printf("%5d", A[i][j]);
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
