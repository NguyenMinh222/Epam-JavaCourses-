package linear_programs;

import java.util.Scanner;

// Найдите значение функции: z = ((a-3)*b/2)+c
public class First_Task {
    public static void main(String[] args){
        System.out.println("Введите литералы для переменных a, b, c: от 1 до 100");

        float a = isNumber("a");
        float b = isNumber("b");
        float c = isNumber("c");

        float z = (((a-3) * b / 2) + c);
        System.out.print("z = " + z);
    }

    public static float isNumber(String value){
        Scanner input = new Scanner(System.in);
       while(true){
           System.out.print(value + " = ");
           String inputValue = input.next();
           try{
               float finalValue = Float.parseFloat(inputValue);
               if(finalValue >=1 && finalValue <= 100){
                   return finalValue;
               }
               else{
                   System.out.println("Введенное число не соответствует условию!");
               }
           }catch (NumberFormatException e){
               System.out.println("Неверные введенные данные! Введенное данное должно быть числом!");
           }
       }
    }
}
