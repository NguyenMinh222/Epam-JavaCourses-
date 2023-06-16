package two_dimensional_arrays;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Task_Eight {
    /* в В числовой матрице поменять местами два столбца любых столбца, то есть, все
    * элементы одного столбца поставить на соответствующие им позиции другого, а его элементы
    * второго переместить в пермый. Номера столбцов вводит пользователь с клавиатуры*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int m = isNum("m");
        int i, j, count = 0;
        float[][] A = new float[n][m];
        Random rnd = new Random();

        System.out.println("Source matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                A[i][j] = rnd.nextFloat(-100, 100);
                System.out.printf("%12f", A[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int col_one = check_number_of_column("first column: ", m, 0) - 1;
        int col_two = check_number_of_column("second column: ", m, col_one) - 1;
        float[][] Temp = new float[n][m];

        for(i = 0; i < A.length; i++){
            Temp[i][0] = A[i][col_one];
            A[i][col_one] = A[i][col_two];
            A[i][col_two] = Temp[i][0];
        }

        System.out.println("\nNew matrix: ");
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                System.out.printf("%12f", A[i][j]);
            }
            System.out.println();
        }
    }

    public static int check_number_of_column(String text,  int y, int z){
        while(true){

            System.out.print("Choose the number of " + text);
            String x = input.next();

            try{
                int temp = Integer.parseInt(x);
                if(temp <= 0 || temp > y){
                    System.out.println("Input a positive value more than 0 and less the size of matrix.");
                }else {
                    if(Objects.equals(text, "first column: ")){
                        return Integer.parseInt(x);
                    }else{
                        if(temp - 1 != z){
                            return Integer.parseInt(x);
                        }else{
                            System.out.println("The number of second column cannot be identical to first chosen column.");
                        }
                    }

                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data");
            }
        }
    }

    public static int isNum(String val){

        while(true){

            System.out.print("Input a value for " + val + " = ");
            String x = input.next();

            try{
                int temp = Integer.parseInt(x);
                if(temp <= 0){
                    System.out.println("Input a positive value more than 0.");
                }else {
                    return Integer.parseInt(x);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect data");
            }
        }
    }
}
