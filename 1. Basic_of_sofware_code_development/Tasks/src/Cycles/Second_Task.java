package Cycles;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Second_Task {
    static Scanner input = new Scanner(System.in);

    public static void  main(String[] args) {

        System.out.println("Input a values for a and b.");
        double a = isNumber("a");
        double b = isNumber("b");

        System.out.println("Input the value of step h.");
        double h = isNumber("h");

        DecimalFormat df = new DecimalFormat("#.##");

        double i;
        int j;
        if(a >= b){
            System.out.println("the value a can't be greater than b.");
        }else {
            System.out.println("Results: ");
            for(i = a, j = 0; i <= b; i += h, j++){
                if(i > 2){
                    System.out.println(j + ") y = " + df.format(i));
                }else {
                    if(i == 0){
                        System.out.println(j + ") y = " + df.format(i));
                    }
                    else{
                        System.out.println(j + ") y = " + df.format(-1*i));
                    }
                }
            }
        }
    }

    public static double isNumber(String value){

        while(true){
            System.out.print(value + " = ");
            String inputValue = input.next();
            try{
                double parse_Value = Double.parseDouble(inputValue);

                if(Objects.equals(value, "h") && parse_Value <= 0){
                    System.out.println("Pls, input a positive value oh step h.");
                } else {
                    return parse_Value;
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data!");
            }
        }

    }
}
