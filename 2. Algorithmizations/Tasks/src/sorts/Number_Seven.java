package sorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number_Seven {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n"), m = isNum("m");
        int i, j;
        int[] A = new int[n + m];
        int[] B = new int[m];

        Random rnd = new Random();


        System.out.println("\nSequence A:");
        System.out.print("[");
        for(i = 0; i < n; i++){
            A[i] = rnd.nextInt(i, i + 2);
            System.out.print(A[i] + " ");
        }
        System.out.print("]\n");

        System.out.println("\nSequence B:");
        for(j = 0; j < m; j++){
            B[j] = rnd.nextInt(j, j + 2);
        }
        System.out.println(Arrays.toString(B) + "\n");

        int k = A.length - 1;
        i = n - 1;
        j = m - 1;

        while (j >= 0){
            if(i >= 0 && A[i] > B[j]){
                A[k] = A[i];
                i--;
            }
            else{
                A[k] = B[j];
                System.out.println("we should place the number " + B[j] + " in the sequence A under the index: " + (k + 1));
                j--;
            }
            k--;
        }

        System.out.println("\nNew Sequence A:");
        for(i = 0; i < A.length; i++){
            System.out.printf("%2d", A[i]);
        }
    }

    public static int isNum(String letter){
        while(true){
            System.out.print("Input the size of array " + letter + " = ");
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
