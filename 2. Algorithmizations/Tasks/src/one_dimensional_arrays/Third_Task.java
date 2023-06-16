package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Third_Task {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n;

        while(true){
            System.out.print("Input the size of array. N = ");
            String N = input.next();
            try{
                n = Integer.parseInt(N);
                break;
            }catch(NumberFormatException e){
                System.out.println("Incorrect input data!");
            }
        }

        Random rnd = new Random();
        int[] A = new int[n];
        int j = 0, k = 0, m = 0;

        for(int i = 0; i < n; i ++){
            A[i] = rnd.nextInt(-10, 10);
            System.out.println((i+1) + ". " + A[i]);
           if(A[i] < 0){
               j++;
           } else if (A[i] > 0) {
               k++;
           } else {
               m++;
           }
        }

        System.out.println("1. The number of negative elements: " + j
                + "\n2. The number of positive elements: " + k
                + "\n3. The number of elements which equals 0: " + m);

    }
}
