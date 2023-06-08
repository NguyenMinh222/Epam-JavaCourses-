package branchings;

import java.util.Scanner;

public class Task_Four {

    static Scanner input = new Scanner(System.in);

    public static void  main(String[] args){

        System.out.println("Input values for a rectangle hole.");
        double A = isNumber("A");
        double B = isNumber("B");

        System.out.println("Input values for a brick.");
        double x = isNumber("x");
        double y = isNumber("y");
        double z = isNumber("z");

        if(A >= z && (B >= x || B >= y)){
            System.out.println("The brick will enter through the hole.");
        } else if(A >= x && (B >= z || B >= y)){
            System.out.println("The brick will enter through the hole.");
        } else if (A >= y && (B >= x || B >= z)){
            System.out.println("The brick will enter through the hole.");
        } else {
            System.out.println("The brick will not enter through the hole.");
        }

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
