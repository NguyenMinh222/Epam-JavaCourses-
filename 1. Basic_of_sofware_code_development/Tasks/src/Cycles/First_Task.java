package Cycles;

import java.util.Scanner;

public class First_Task {

    static Scanner input = new Scanner(System.in);

    public static void  main(String[] args) {

        System.out.println("Input a value for x.");
        int X = isNumber("X");

        int sum = 0;
        for(int i = 1; i <= X; i++){
            sum = sum + i;
        }
        System.out.println("Summ = " + sum);
    }


    public static int isNumber(String value){

        while(true){
            System.out.print(value + " = ");
            String inputValue = input.next();
            try{
                int x = Integer.parseInt(inputValue);
                if(x > 0){
                    return x;
                }else {
                    System.out.println("Введите только положительное число!");
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data!");
            }
        }

    }
}
