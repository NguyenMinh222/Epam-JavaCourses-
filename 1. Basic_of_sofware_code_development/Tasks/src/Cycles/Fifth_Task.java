package Cycles;

import java.util.Scanner;

public class Fifth_Task {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isIntNumber("n");
        double e = 0.0001;

        double sum = 0;

        for(int i = 1; i <= n; i++){

            double module = Math.abs(1/(Math.pow(2, i)) + 1/(Math.pow(3, i)));

            if(module > e){
                System.out.println("a" + i + " = " + module + " > " + e );
                sum = sum + module;
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static int isIntNumber(String value){
        while(true){
            System.out.println("Input a value for " + value + ".");
            System.out.print(value + " = ");
            String number = input.next();

            try{
                int temp = Integer.parseInt(number);
                if(temp > 0){
                    return temp ;
                }
            }catch (NumberFormatException e){
                System.out.println("Error!");
            }
        }
    }
}
