package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Seventh_Task {
    /*Даны действительные числа a1, a2, a3, ..., an. Найти max(a1 + a2n, a2 + a2n-1, ...)*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n;

        while(true){
            System.out.print("Input the size of array. N = ");
            String N = input.next();
            try{
                n = Integer.parseInt(N);
                if(n % 2 != 0){
                    System.out.println("Input even value for n!");
                } else {
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Incorrect input data!");
            }
        }

        Random rnd = new Random();
        int[] A = new int[n];

        System.out.println("Real numbers: ");
        for(int i = 0; i < A.length; i++){
            A[i] = rnd.nextInt(-100, 100);
            System.out.print(A[i] + " ");
        }

        int[] B = new int[n / 2];
        int max = 0;

        System.out.println("\nThe sum of real numbers: ");
        for(int j = 0; j < B.length; j++){
            B[j] = A[j] + A[A.length- 1 - j];
            max = B[0];
            if(B[j] > max){
                max = B[j];
            }
            System.out.print(B[j] + " ");
        }

        System.out.println("\nMax sum of real numbers is: " + max);
    }
}
