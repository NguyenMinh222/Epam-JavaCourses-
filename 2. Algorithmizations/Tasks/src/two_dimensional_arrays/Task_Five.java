package two_dimensional_arrays;

import java.util.Scanner;

public class Task_Five {
    /*Сформировать квадратную матрицу порядка n по заданному образцу(n-четное)
    * 1111
    * 2220
    * 3300
    * 4000*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int i, j;
        int[][] A = new int[n][n];

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                if(j < A[i].length - i){
                    A[i][j] = i + 1;
                }
               System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int isNum(String val){

        while(true){

            System.out.print("Input a value for " + val + " = ");
            String x = input.next();

            try{
                int temp = Integer.parseInt(x);
                if(temp <= 0 || temp % 2 != 0){
                    System.out.println("Input a positive even value more than 0.");
                }else {
                    return Integer.parseInt(x);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data");
            }
        }
    }
}
