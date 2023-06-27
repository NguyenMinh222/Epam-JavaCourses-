package sorts;

import java.util.Random;
import java.util.Scanner;

public class Six_ShellSort {
    /*Реализовать сортировку Шелла*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] srgs){

        int n = isNum();
        int i;
        int[] A = new int[n];
        Random rnd = new Random();

        System.out.println("Source array:");
        for(i = 0; i < A.length; i++){
            A[i] = rnd.nextInt(-n, n + 1);
            System.out.print(A[i] + " ");
        }

        ShellSort(A);

        System.out.println("\n\nSorted array:");
        for (i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void ShellSort(int[] A){

        int i, j;

        int temp = 0;
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A.length - 1; j++){
                if(A[j] > A[j + 1]){
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                    //Сдвигаемся на один элемент назад - возможно неправильно понял условия
                    if (j > 0){
                        j -= 1;
                    }
                }
            }
        }
    }

    public static int isNum(){
        while(true){
            System.out.print("Input the size of array n = ");
            String value = input.next();

            try{
                if(Integer.parseInt(value) <= 0){
                    System.out.println("The size can't be negative!");
                }else{
                    return Integer.parseInt(value);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect input data!");
            }
        }
    }
}
