package two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task_Sixteen {
    /*Построить магический квадрат порядка n.*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        final int n = 3;
        int i, j, firstRowSum = 0, sum;
        boolean result;
        int[][] A = new int[n][n];
        Random rnd = new Random();

        do {
            for (j = 0; j < A[0].length; j++) {
                for (i = 0; i < A.length; i++) {
                    A[i][j] = rnd.nextInt((int) Math.pow(n, 2) + 1);
                }
            }

            result = true;

            //Высчитываем сумму первой строки для сравнения с другими
            for(j = 0; j < A.length; j++){
                firstRowSum += A[0][j];
            }

            //Сравниваем оставшиеся строки с первой и в случае неравенства - завершаем цикл и заново генерируем матрицу
            for(i = 0; i < A.length; i++){
                sum = 0;
                for (j = 0; j < A.length; j++){
                    sum += A[i][j];
                }
                if(sum != firstRowSum){
                    result = false;
                    break;
                }
            }

            //Проверяем колонки, если со строками все ок. Ситуация анологична со строками
            //Проверка начинается только в том случае если сумма у строк соответсвует условию
            if(result){
                for(i = 0; i < A.length; i++){
                    sum = 0;
                    for (j = 0; j < A.length; j++){
                        sum += A[j][i];
                    }
                    if(sum != firstRowSum){
                        result = false;
                        break;
                    }
                }
            }

            //Проверка главной диагонали
            if(result){
                sum = 0;
                for(i = 0; i < A.length; i++){
                    sum += A[i][i];
                }
                if(sum != firstRowSum){
                    result = false;
                }
            }

            //ПРоверка второй главной диагонали
            if(result){
                sum = 0;
                for(i = 0; i < A.length; i++){
                    sum += A[i][A.length - 1 - i];
                }
                if(sum != firstRowSum){
                    result = false;
                }
            }

            firstRowSum = 0;

        }while(!result);

        System.out.println("Magic square 3x3:");
        for(i = 0; i < A.length; i++){
            for (j = 0; j < A[i].length; j++){
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}
