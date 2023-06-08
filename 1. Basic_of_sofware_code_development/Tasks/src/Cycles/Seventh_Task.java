package Cycles;

import java.util.Scanner;

public class Seventh_Task {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int m = isIntNumber("m");
        int n = isIntNumber("n");

        while(true){
            if(m >= n){
                System.out.println("m can't be greater or equal than n!");
                m = isIntNumber("m");
                n = isIntNumber("n");
            }else {
                break;
            }
        }

        System.out.println("\nResults.");
        for(int i = m; i <= n; i++){
            System.out.print(i + ": ");
            for(int j = 2; j < i - 1; j++){
                if(i % j == 0){
                    System.out.print(j + ",");
                }
            }
            System.out.println();
        }
    }

    public static int isIntNumber(String value){
        while(true){
            System.out.println("Input a value for " + value + ".");
            System.out.print(value + " = ");
            String number = input.next();

            try{
                int temp = Integer.parseInt(number);
                if(temp >= 0){
                    return temp ;
                }
            }catch (NumberFormatException e){
                System.out.println("Error!");
            }
        }
    }
}
