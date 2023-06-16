package one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Second_Task {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n;
        double z = 5.231;

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
        double[] A = new double[n];
        int j = 0;

        for(int i = 0; i < n; i ++){
            A[i] = rnd.nextDouble(-10, 10) + 1;
            if(A[i] > z){
                j++;
                System.out.print(A[i] + " => ");
                A[i] = z;
            }
            System.out.println(A[i]);
        }

        System.out.println("Number of substitutions: " + j);
    }
}
