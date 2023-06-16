package two_dimensional_arrays;

import java.util.Random;

public class Task_Thirteen {
    /*Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов*/
    public static void main(String[] args){

        int[][] A = new int[6][5];
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
        for(j = 0; j < A[0].length; j++){
            for(i = 0; i < A.length; i++){
                for(k = 0; k < A.length - 1; k++){
                    if(A[k][j] > A[k + 1][j]){
                        temp = A[k][j];
                        A[k][j] = A[k + 1][j];
                        A[k + 1][j] = temp;
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
        for(j = 0; j < A[0].length; j++){
            for(i = 0; i < A.length; i++){
                for(k = 0; k < A.length - 1; k++){
                    if(A[k][j] < A[k + 1][j]){
                        temp = A[k][j];
                        A[k][j] = A[k + 1][j];
                        A[k + 1][j] = temp;
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
