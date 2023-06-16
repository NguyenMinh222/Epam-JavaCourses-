package two_dimensional_arrays;

import java.util.Scanner;

public class Task_Seven {
    /*Сформировать квадратную матрицу порядка N по правилу
    A[i, j] = sin((i^2 - j^2) / n) и подсчитать количество положительных жлементов в ней
    * */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int i, j, count = 0;
        float[][] A = new float[n][n];

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = (float)Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if(A[i][j] > 0){
                    count++;
                }
                System.out.printf("%12f", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nThe count of positive numbers in matrix is " + count);
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
