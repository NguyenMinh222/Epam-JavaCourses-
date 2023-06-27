package decomposition;

import java.util.Scanner;

public class Seventeen_Task {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int number = isNumber("Number");
        System.out.println("Count of operations: " + recursion(number));
    }

    public static int k = 0;
    static int recursion(int number){

        String str_number = String.valueOf(number);
        char[] number_array = str_number.toCharArray();
        int i, sum_ofNumbers = 0;

        for(i = 0; i < number_array.length; i++){
            sum_ofNumbers += Character.getNumericValue(number_array[i]);
        }

        if(number == 0){
            return k;
        }else{
            int temp = number-sum_ofNumbers;
            System.out.println(++k + ": " + temp);
            return recursion(temp);
        }
    }

    static int isNumber(String letter){
        while(true){

            System.out.print("Input the number of points on the plane " + letter + " = ");
            String number = input.next();

            try{
                if(Integer.parseInt(number) <= 1){
                    System.out.println("Pls, enter the number more than 1");
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
