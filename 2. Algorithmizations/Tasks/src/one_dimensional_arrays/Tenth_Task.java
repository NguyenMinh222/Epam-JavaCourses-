package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Tenth_Task {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n;

        while(true){
            System.out.println("Input a value for N = ");
            String N = input.next();

            try{
                if(Integer.parseInt(N) < 0){
                    System.out.println("A value N can't be negative!");
                }else{
                    n = Integer.parseInt(N);
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data!");
            }
        }

        int[] A = new int[n];
        int i;
        Random rnd = new Random();

        System.out.println("Source array:");
        for(i = 0; i < A.length; i++){
            A[i] = rnd.nextInt(-55, 55);
            System.out.print(A[i] + " ");
        }

        System.out.println("\nChanged array:");
        for(i = 0; i < A.length; i++){
            if(i % 2 == 0){
                A[i] = 0;
            }
            System.out.print(A[i] + " ");
        }
    }
}
