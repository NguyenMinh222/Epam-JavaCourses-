package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Fifth_Task {
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
        int j, k = 0, m = 0;

        System.out.println("Source array: ");
        for(int i = 0; i < n; i ++){
            A[i] = rnd.nextInt(-100, 100);
            if(A[i] > i){
                System.out.println(A[i] + " > " + "i = " + i);
            }
        }
    }
}
