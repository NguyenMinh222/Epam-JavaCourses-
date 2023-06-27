package decomposition;

import java.util.Scanner;

public class Eleven_Task {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int first_number = isNumber("first number");
        int second_number = isNumber("second number");
        int size_one = Array(first_number), size_two = Array(second_number);

        if (size_one > size_two){
            System.out.println("There are more digits in the first number: " + first_number + "("
            + size_one + ") > " + size_two + "(" + size_two + ")");
        }else if(size_one == size_two){
            System.out.println("There are equals digits in two numbers: " + first_number + "("
                    + size_one + ") = " + size_two + "(" + size_two + ")");
        }else{
            System.out.println("There are more digits in the second numbers: " + first_number + "("
                    + size_one + ") < " + second_number + "(" + size_two + ")");
        }
    }

    static int Array(int N){
        String N_str = String.valueOf(N);
        char[] char_array = N_str.toCharArray();
        return char_array.length;
    }

    static int isNumber(String letter){
        while(true){

            System.out.print("Input the number of points on the plane " + letter + " = ");
            String number = input.next();

            try{
                if(Integer.parseInt(number) < 0){
                    System.out.println("Pls, enter the number more than 0");
                }else{
                    return Integer.parseInt(number);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input data!");
            }
        }
    }
}
