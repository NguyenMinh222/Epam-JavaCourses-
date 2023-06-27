package decomposition;

import java.util.Random;
import java.util.Scanner;

public class Task_Five {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int N = isNumber("N");
        int[] Array = new int[N];
        int i;

        Random rnd = new Random();

        System.out.println("Array of numbers:");
        for (i = 0; i < N; i++){
            Array[i] = rnd.nextInt(-100, 101);
            System.out.print(Array[i] + " ");
        }

        theSecondMaxElement(Array);
    }

    static void theSecondMaxElement(int[] Array){
        int min, i;
        int max = min = 0 ;

        //First we try to find the max element
        for(i = 0; i < Array.length; i++){
            if(Array[i] > max){
                max = Array[i];
            }
        }

        for(i = 0; i < Array.length; i++){
            if(Array[i] < min){
                min = Array[i];
            }
        }

        for(i = 0; i < Array.length; i++){
            if (Array[i] > min && Array[i] != max){
                min = Array[i];
            }
        }

        System.out.println("\nThe second max element is: " + min);
    }

    static int isNumber(String letter){
        while(true){

            System.out.print("Input the number of points on the plane " + letter + " = ");
            String number = input.next();

            try{
                if(Integer.parseInt(number) <= 1){
                    System.out.println("Pls, enter the number more than 1");
                }else{
                    return Integer.parseInt(number);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input data!");
            }
        }
    }
}
