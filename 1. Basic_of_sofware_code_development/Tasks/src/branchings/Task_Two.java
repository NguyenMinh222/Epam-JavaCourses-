package branchings;

import java.util.Scanner;

public class Task_Two {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        double a = isNumber("a");
        double b = isNumber("b");
        double c = isNumber("c");
        double d = isNumber("d");

        double min_ab = Min(a,b);
        double min_cd = Min(c,d);

        double max_Value;
        if(min_ab >= min_cd){
            max_Value = min_ab;
        }else {
            max_Value = min_cd;
        }
        System.out.println("Max(min(a,b), min(c,d)): " + max_Value);
    }

    public static double Min(double x, double y){
        if(x > y){
            return y;
        }else{
            return x;
        }
    }

    public static double isNumber(String value){

        while(true){
            System.out.print(value + " = ");
            String inputValue = input.next();
            try{
                return Double.parseDouble(inputValue);
            }catch (NumberFormatException e){
                System.out.println("Неверные введенные данные! Введенное данное должно быть числом!");
            }
        }
    }
}
