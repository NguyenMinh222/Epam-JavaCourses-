package sorts;

import java.util.Random;
import java.util.Scanner;

public class Number_One {
    /*Заданы два одномерных массива с различным количеством элементов и натурольное число K.
    * Объединить их в один массив, включив второй массив между k-m и (k+1)-м
    * элементами первого, при этом не используя дополнительный массив.*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int i, j;
        final int n = 5, m = 6, k = 3;
        int[] A = new int[n + m];
        int[] B = new int[m];

        Random rnd = new Random();

        System.out.println("Array A:");
        for(i = 0; i < n; i++){
            A[i] = rnd.nextInt(51);
            System.out.printf("%5d", A[i]);
        }

        System.out.println("\nArray B:");
        for(i = 0; i < m; i++){
            B[i] = rnd.nextInt(51, 101);
            System.out.printf("%5d", B[i]);
        }

        //Нужно также сами элемнты в массиве А сместить в конец а иначе последние элементы зполнятся нулями
        System.arraycopy(A, k, A, A.length - k + 1, n - k);
        System.out.println();
        for(i = 0; i < A.length; i++){
            System.out.printf("%5d", A[i]);
        }
        //1. Исходный массив, из которого нужно скопировать элементы;
        //2. Начальный индекс в исх массиве, с которого начать копирование;
        //3. Новый массив, куда нужно вставить скопированные элементы;
        //4. Индекс;
        //5. Количество элементов, которые нужно скопировать.
        System.arraycopy(B, 0, A, k, B.length);

        System.out.println("\nNew array A:");
        for(i = 0; i < A.length; i++){
            System.out.printf("%5d", A[i]);
        }
    }
}
