package two_dimensional_arrays;

import java.util.Random;

public class Task_Eleven {
    /*Матрцу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу
    * и номера строк, в которых число 5 встречается три и более раз*/

    public static void main(String[] args){

        int[][] A = new int[10][20];
        Random rnd = new Random();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextInt(16);
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        int count = 0;

        System.out.println("\nThe numbers of the rows where the number 5 occurs 3 and more times: ");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
               if(A[i][j] == 5){
                   count++;
               }
            }

            if(count >= 3){
                System.out.println(i + ": " + count);
            }
            count = 0;
        }

    }
}
