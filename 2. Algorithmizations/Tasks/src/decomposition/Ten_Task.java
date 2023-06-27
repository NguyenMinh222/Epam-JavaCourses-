package decomposition;

import java.util.Scanner;

public class Ten_Task {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int N = isNumber("N");
        Array(N);
    }

    static void Array(int N){
        String N_str = String.valueOf(N);
        char[] char_array = N_str.toCharArray();
        int[] new_array = new int[char_array.length];

        for (int i = 0; i < char_array.length; i ++){
            new_array[i] = Character.getNumericValue(char_array[i]);
            System.out.print(new_array[i] + " ");
        }
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
