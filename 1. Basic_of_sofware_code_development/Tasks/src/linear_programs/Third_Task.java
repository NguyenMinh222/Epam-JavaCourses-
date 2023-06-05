package linear_programs;

import java.util.Scanner;

public class Third_Task {
    public static void main(String[] args){
        float x = isNumber("x");
        float y = isNumber("y");

        float z = (float) ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
        System.out.println("z = " + z);
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
