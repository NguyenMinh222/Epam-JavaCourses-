package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class First_Task {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n;
        int k = 6;

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
        int sum = 0, j = 1;

        System.out.println("Numbers that multiples of K: ");
        for(int i = 0; i < n; i ++){
            A[i] = rnd.nextInt(1000) + 1;
            if(A[i] % k == 0){
                System.out.println(j + ". " + A[i]);
                sum = sum + A[i];
                j++;
            }
        }

        System.out.println("The sum of the numbers of multiples of K. Sum = " + sum);
    }
}
