package decomposition;

import java.util.Scanner;

public class Task_Three {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int a = isNum();
        System.out.println("\nThe square of hexagon is " + squareOfHexagon(a));
    }

    //Формула площади равностороннего треугольника
    static double squareOfHexagon(int a){
        return (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
    }

    static int isNum(){
        while(true){
            System.out.print("Input the size of hexagon side a = ");
            String a = input.next();

            try {
                if(Integer.parseInt(a) <= 0){
                    System.out.println("The size can't be negative and equals to 0!");
                }else{
                    return Integer.parseInt(a);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data!");
            }
        }
    }
}
