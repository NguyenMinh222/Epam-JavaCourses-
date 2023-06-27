package decomposition;

import java.util.Scanner;

public class Fourteen_Task {
    /*Написать программу для вычисления : является ли число числом Армстронга. В условии немного неправильно написано про сумму цифр в степени!*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int k = isNumber("k");
        createArray(k);
    }

    //Число делим на цифры и ищем сумму каждой цифры в степени n
    static boolean findArmstrong(int number){
        String str_number = String.valueOf(number);
        char[] char_array = str_number.toCharArray();
        int i, sum = 0;
        int n = char_array.length;

        for (i = 0; i < char_array.length; i++){
            sum += Math.pow(Character.getNumericValue(char_array[i]), n);
        }

        return sum == number;
    }

    static void createArray(int K){
        int[] A = new int[K];
        int i;

        for(i = 0; i < A.length; i++){
            A[i] = i + 1;
            if(findArmstrong(A[i])){
                System.out.println(A[i] + " - Armstrong number");
            }
        }
    }

    static int isNumber(String letter){
        while(true){

            System.out.print("Input the number of points on the plane " + letter + " = ");
            String number = input.next();

            try{
                if(Integer.parseInt(number) < 1){
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
