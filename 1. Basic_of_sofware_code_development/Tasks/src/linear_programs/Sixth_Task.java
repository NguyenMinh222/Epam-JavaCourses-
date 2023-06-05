package linear_programs;

import java.util.Scanner;

public class Sixth_Task {
     public static void main(String[] args){

         int x = isNumber("x");
         int y = isNumber("y");

         int[] x1 = {-2, -1, 0, 1, 2};
         int[] x2 = {-4, -3, -2, -1, 0, 1, 2, 3, 4};

         int[] y1 = {0, 1, 2, 3, 4};
         int[] y2 = {-3, -2, -1, 0};

         boolean true_false_x = false;
         boolean true_false_y = false;

         for(int value_x: x1){
             if(value_x == x){
                 true_false_x = true;
                 break;
             }
         }

         for(int value_y: y1){
             if(value_y == y){
                 true_false_y = true;
                 break;
             }
         }

        if(true_false_x && true_false_y){
            System.out.println("true");
        }else {
            true_false_x = false;
            true_false_y = false;

            for(int value_x: x2){
                if(value_x == x){
                    true_false_x = true;
                    break;
                }
            }

            for(int value_y: y2){
                if(value_y == y){
                    true_false_y = true;
                    break;
                }
            }

            if(true_false_x && true_false_y) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
     }

     public static int isNumber(String value){
         Scanner input = new Scanner(System.in);
         while(true){
             System.out.print(value + " = ");
             String input_value = input.next();
             try{
                 return Integer.parseInt(input_value);
             }catch(NumberFormatException e){
                 System.out.println("Ошибка!");
             }
         }
     }
}
