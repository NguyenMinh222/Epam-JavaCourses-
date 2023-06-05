package linear_programs;

import java.util.Scanner;

public class Fourth_Task {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Введите число R вида nnn.ddd.");
            System.out.print("number = ");
             String value = input.next();

             try{
                 float convert_Number = Float.parseFloat(value);
                 if(convert_Number >= 100 && convert_Number < 1000){
                    String[] substrings = value.split("\\.");
                    if(substrings[0].length() == substrings[1].length()){
                        char[] value_symbols = value.toCharArray();
                        System.out.print("Полученое число: ");
                        for(int i = value_symbols.length - 1; i >= 0; i --){
                            System.out.print(value_symbols[i]);
                        }
                        break;
                    }
                    else {
                        System.out.println("Не удалось поменять местами дробную и целую части. " +
                                "В дробной и целой части должны быть 3 числа!");
                    }
                 }
                 else{
                     System.out.println("Неверно введены данные!");
                 }
             }catch(NumberFormatException e){
                 System.out.println("Ошибка!");
             }
        }
    }
}
