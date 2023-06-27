package sorts;

import java.util.Random;

public class Three_SortingByChoice {
    /*Сортировка выбором. Есть последовательность начиная с первого элемента массива,
    * выбирается наибиольший элемент и ставится на первое место, а первый - на место наибольшего.
    * Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.*/
    public static void main(String[] args){

        int i;
        final int n = 10;
        int[] A = new int[n];
        Random rnd = new Random();

        System.out.println("Source array:");
        for(i = 0; i < A.length; i++){
            A[i] = rnd.nextInt(i, i + 2);
            System.out.printf("%3d", A[i]);
        }
        //Проверка с отрицательными числами
        //int[] A = {-2, -2, -1, 3, 6};

        int k = 0;

        while(k < A.length){

            int max = A[k];
            int id = 0;

            //Находим максимальный элемент массива и его индекс
            for(i = k; i < A.length; i++){
                if(A[i] >= max){
                    max = A[i];
                    id = i;
                }
            }

            //Меняем местами самое большое число в массиве с первым, вторым и тд местами
            int temp = A[k];
            A[k] = A[id];
            A[id] = temp;

            k++;
        }

        System.out.println("\nSorted array:");
        for(i = 0; i < A.length; i++){
            System.out.printf("%3d", A[i]);
        }
    }
}
