package two_dimensional_arrays;

import java.util.Random;

import static java.lang.Math.random;

public class Task_Twelve {
    /*Отсортировать строки матрицы по возрастанию и убыванию значений элементов*/
    public static void main(String[] args){

        int[][] A = new int[5][6];
        int i, j, k;
        Random rnd = new Random();

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i ++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextInt(-50, 51);
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        int temp = 0;
        System.out.println("\nSort in ascending order:");
        for(i = 0; i < A.length; i ++){
            for(j = 0; j < A[i].length; j++){
                for(k = 0; k < A[i].length - 1; k++){
                    if(A[i][k] > A[i][k + 1]){
                        temp = A[i][k];
                        A[i][k] = A[i][k + 1];
                        A[i][k + 1] = temp;
                    }
                }
            }
        }

        for(i = 0; i < A.length; i ++){
            for(j = 0; j < A[i].length; j++){
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSort in descending order:");
        for(i = 0; i < A.length; i ++){
            for(j = 0; j < A[i].length; j++){
                for(k = 0; k < A[i].length - 1; k++){
                    if(A[i][k] < A[i][k + 1]){
                        temp = A[i][k];
                        A[i][k] = A[i][k + 1];
                        A[i][k + 1] = temp;
                    }
                }
            }
        }

        for(i = 0; i < A.length; i ++){
            for(j = 0; j < A[i].length; j++){
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

    }
}
