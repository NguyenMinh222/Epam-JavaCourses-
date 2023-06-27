package sorts;

import java.util.Random;

public class Number_Two {
    /*Даны две последовательности a1 <= a2 <= a3 <= ... <= an и b1 <= b2 <=... <= bn
    * Образовать из низ новую последовательность чиел так, чтобы она тоже была неубывающей.
    * Доп массив не использовать*/
    public static void main(String[] args){

        int i, j;
        final int n = 8, m = 7;
        int[] A = new int[n + m];
        int[] B = new int[m];

        Random rnd = new Random();

        System.out.println("Sequence A:");
        for(i = 0; i < n; i++){
            A[i] = rnd.nextInt(i, i + 2);
            System.out.printf("%2d", A[i]);
        }

        System.out.println("\nSequence B:");
        for(j = 0; j < m; j++){
            B[j] = rnd.nextInt(j, j + 2);
            System.out.printf("%2d", B[j]);
        }

        int k = A.length - 1;
        i = n - 1;
        j = m - 1;

        //Выполняем цикл до тех пор, пока j >= 0
        while(j >= 0){
            if(i >= 0 && A[i] > B[j]){//Сравниваем два последних элемента в 2-ух массивах и наибольшее отправляем в конец нового массива
                A[k] = A[i];
                i--;// уменьшаем i на 1 если элементу у А больше чем у В. Индекс j сохраняем для последующего сравнения
            }else{
                A[k] = B[j];
                j--;
            }
            k--;
        }

        System.out.println("\nNew Sequence A:");
        for(i = 0; i < A.length; i++){
            System.out.printf("%2d", A[i]);
        }
    }
}
