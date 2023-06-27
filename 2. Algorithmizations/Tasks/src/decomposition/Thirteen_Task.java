package decomposition;

import java.util.Scanner;

public class Thirteen_Task {
    /*Два простых числа называются "близнецами, если они отличаются друг от друга на 2. Найти и распечатать все пары близнецов из отрезка [n, 2n]"*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int N = isNumber("N");
        findTwins(N);
    }

    static void findTwins(int N){
        int[] A = createArray(N);
        int i, j, k = 0;

        System.out.println("\nAll twins on te segment:");
        for (i = 0; i < A.length; i++){
            for (j = i; j < A.length; j++){//чтобы не было повторений
                if(Math.abs(A[i] - A[j]) == 2){
                    System.out.println(++k + ": " + A[i] + " and " + A[j]);
                }
            }
        }
    }
    static int[] createArray(int N){
        int[] A = new int[N + 1];
        int i;

        for(i = 0; i < A.length; i++, N++){
            A[i] = N;
            System.out.print(A[i] + " ");
        }
        System.out.println();

        return A;
    }

    static int isNumber(String letter){
        while(true){

            System.out.print("Input the number of points on the plane " + letter + " = ");
            String number = input.next();

            try{
                if(Integer.parseInt(number) <= 1){
                    System.out.println("Pls, enter the number more than 2");
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
