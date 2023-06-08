package Cycles;

public class Fouth_Task {

    //Составить программу нахождения произведения квадратов первых двухсот чисел
    public static void main(String[] args){
        long sum_of_mult = 1;

        for (int i = 1; i <= 200;  i++){
            sum_of_mult = (long) (sum_of_mult * Math.pow(i, 2));
        }
        System.out.println("sum_of_mult = " + sum_of_mult);
    }
}
