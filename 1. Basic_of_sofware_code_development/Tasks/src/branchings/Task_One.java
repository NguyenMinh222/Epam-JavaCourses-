package branchings;

import java.util.Scanner;

public class Task_One {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        double a = trueNum("a");
        double b = trueNum("b");
        double c = 180 - (a + b);

        System.out.println("c = " + c);

        if(c > 0){
            System.out.println("Такой треугольник существует!");

            if(a == 90 || b == 90 || c == 90){
                System.out.println("Треугольник является прямоугольным!");
            }
        }else {
            if(c < 0){
                System.out.println("Угол в треугольнике не может быть отрицательным!!!");
            }
            System.out.println("Такого треугольника не существует!");
        }
    }

    public static double trueNum(String value) {
        while(true){
            System.out.print(value + " = ");
            String input_Value = input.next();

            try {
                double conv_InputValue = Double.parseDouble(input_Value);
                if(conv_InputValue > 0 && conv_InputValue <= 360){
                    return conv_InputValue;
                } else{
                    System.out.println("Градусы не могут быть отрицательными и больше 360!");
                }
            }catch (NumberFormatException e){
                System.out.println("Ошибка!");
            }
        }
    }
}
