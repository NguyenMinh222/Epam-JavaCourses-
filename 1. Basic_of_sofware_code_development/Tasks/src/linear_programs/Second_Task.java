package linear_programs;


import java.util.Scanner;

public class Second_Task {
    public static void main(String[] args){

        float a = isNumber("a");
        float b = isNumber("b");
        float c = isNumber("c");

        float z = (float) ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / (2 * a)
                - Math.pow(a,3) * c + Math.pow(b, -2));
        System.out.println("z = " + z);
    }

    public static float isNumber(String value){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Введите число в диапазоне от -100 до 100");
            System.out.print(value + " = ");
            String literal = input.next();

            try{
                float convertLiteral = Float.parseFloat(literal);
                if(convertLiteral >= -100 && convertLiteral <= 100){
                    return convertLiteral;
                }else{
                    System.out.println("Введенное число не соответствует условию!");
                }
            }catch (NumberFormatException e){
                System.out.println("Неккоректный ввод данных!");
            }
        }
    }
}
