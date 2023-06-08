package branchings;

import java.util.Scanner;

public class Task_Five {
    static Scanner input = new Scanner(System.in);

    public static void  main(String[] args){

        System.out.println("Input a value for x.");
        double x = isNumber("x");

        double f_x;

        if(x <= 3){
            f_x = Math.pow(x, 2) - 3*x +9;
        }else{
            f_x = 1/(Math.pow(x, 3) + 6);
        }

        System.out.println("F(x) = " + f_x);

    }

    public static double isNumber(String value){

        while(true){
            System.out.print(value + " = ");
            String inputValue = input.next();
            try{
                return Double.parseDouble(inputValue);
            }catch (NumberFormatException e){
                System.out.println("Incorrect data!");
            }
        }

    }
}
