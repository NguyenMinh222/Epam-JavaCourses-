package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Fourth_Task {
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
        float[] A = new float[n];
        int j, k = 0, m = 0;

        System.out.println("Source array: ");
        for(int i = 0; i < n; i ++){
            A[i] = rnd.nextFloat(-100, 100);
            System.out.print(A[i] + " ");
        }

        float max = A[0];
        for(j = 0; j < n; j++){
            if (A[j] > max){
                max = A[j];
                k = j;
            }
        }

        float min = A[0];
        for(j = 0; j < n; j++){
            if (A[j] < min){
                min = A[j];
                m = j;
            }
        }

        A[k] = min;
        A[m] = max;

        System.out.println("\nResult: ");
        for(int i = 0; i < n; i ++){
            System.out.print(A[i] + " ");
        }

        System.out.println("\n" + A[k] + ", " + A[m] + " was changed.");
    }
}
