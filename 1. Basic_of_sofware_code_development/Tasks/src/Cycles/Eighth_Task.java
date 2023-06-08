package Cycles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eighth_Task {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        long a = isIntNumber("a");
        long b = isIntNumber("b");

        //строку на число можно, но если тип int то нельзя
        String str_a = "" + a;
        char[] str_a_c = str_a.toCharArray();

        String str_b = "" + b;
        char[] str_b_c = str_b.toCharArray();

        System.out.println("Общие цифры у " + a + " и " + b + ".");

        List<Character> arr = new ArrayList<Character>();

        for(int i = 0; i < str_a_c.length; i++){
            for (int j = 0; j < str_b_c.length; j++){
                if(str_a_c[i] == str_b_c[j]){
                    if(!arr.contains(str_a_c[i])){
                        arr.add(str_a_c[i]);
                    }
                }
            }
        }

        for(int l = 0; l < arr.size(); l++){
            System.out.print(arr.get(l) + " ");
        }
    }

    public static long isIntNumber(String value){
        while(true){
            System.out.println("Input a value for " + value + ".");
            System.out.print(value + " = ");
            String number = input.next();

            try{
                return Long.parseLong(number);
            }catch (NumberFormatException e){
                System.out.println("Error!");
            }
        }
    }
}
