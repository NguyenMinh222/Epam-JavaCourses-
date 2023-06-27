package decomposition;

import java.util.Random;
import java.util.Scanner;

public class Twelve_Task {
    /*
       Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
       элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
        */
    static Scanner input = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args){
        int K = 15;
        int N = 50;
        printNewArray(K, N);
    }

    //Создаем массив чисел от 10 до 1000, чтобы потом мы смогли создать новый массив, подх для условия
    static int[] Array(){

        final int n = 10;
        int[] Arr = new int[n];
        int i;

        System.out.println("Source Array:");
        for (i = 0; i < Arr.length; i++){
            Arr[i] = rnd.nextInt(10, 1001);
            System.out.print(Arr[i] + " ");
        }

        System.out.println();
        return Arr;
    }

    static void printNewArray(int K, int N){
        int[] Arr_two = Array();
        int count = 0;
        int i;

        for(i = 0; i < Arr_two.length; i++){
            boolean true_false = checkCondition(Arr_two[i], K, N);
            if(true_false){
                count++;//Счетчик для размерности нового массива
            }
        }

        int[] new_Array = new int[count];
        int j = 0;

        //Создание и вывод нового массива
        System.out.println("\nNew Array satisfying the condition: K = " + K + " N = " + N);
        for(i = 0; i < Arr_two.length; i++){
            boolean true_false = checkCondition(Arr_two[i], K, N);
            if(true_false){
                new_Array[j] = Arr_two[i];
                System.out.print(new_Array[j] + " ");
                j++;
            }
        }
    }

    //Проверяем сумму цифр числа(подходит ли по условию или нет)
    static boolean checkCondition(int A, int K, int N){
        String str = String.valueOf(A);
        char[] char_array = str.toCharArray();
        int sum = 0;
        int i;

        for (i = 0; i < char_array.length; i++){
            sum += Character.getNumericValue(char_array[i]);
        }

        return sum == K && sum < N;
    }
}
