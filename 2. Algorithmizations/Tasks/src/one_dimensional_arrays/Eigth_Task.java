package one_dimensional_arrays;

import java.util.Scanner;

public class Eigth_Task {
    /*Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последо
    * вательность, выбросив те члены, которые равны min(a1, a2, ..., an)*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int[] A = {-5, -4, -5, -3, -2, -1, 0, 1, 2, -5, 3, 4, 5};
        int i, min = 0, count = 0;

        System.out.println("Исходная последовательность: ");
        for(i = 0 ; i < A.length; i++){
            System.out.print(A[i] + " ");
            if(A[i] <= min){
                min = A[i];
                count++;
            }
        }

        int[] B = new int[A.length - count];
        int j;

        for(j = 0, i = 0; i < A.length; i++){
            if(A[i] != min){
                B[j] = A[i];
                j++;
            }
        }

        System.out.println("\nНовая последовательность.");
        for(int c : B){
            System.out.print(c + " ");
        }
    }
}
