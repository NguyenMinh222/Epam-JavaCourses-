package one_dimensional_arrays;

import java.util.Scanner;

public class Ninth_Task {
    /*В массиве целых числе с количеством элементов n найти наиболее часто встр-
    * чающее число. Если таких несколько, то определить наименьшее из них*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int[] A = {-5, -5, 4, 4, 3, 2, 1, 1, 1, 1, 6, 6, -6, -6};
        //создаем доп массив без повторений
        int[] B = new int[A.length];
        int size = 0, i, count_dup = 0;

        //Если в массиве B нет числа, то мы добавляем его и если он есть, то завершаем шаг цикла
        for(i = 0; i < A.length; i++){
            boolean duplicate = false;

            for(int j = 0; j < size; j++){
                if(A[i] == B[j]){
                    duplicate = true;
                    count_dup++;
                    break;
                }
            }

            if(!duplicate){
                B[size] = A[i];
                size++;
            }
        }

        //создаем еще один массив без повторения и нулей, поскольку в Java для массива нужно всегда объявлять
        //размер чтобы его использовать
        int[] C = new int[B.length - count_dup];

        for (i = 0; i < C.length; i++){
            C[i] = B[i];
            System.out.print(C[i] + " ");
        }
        System.out.println();

        int temp_val = 0;
        int max_count = 0, min_value = 0;

        for(i = 0; i < C.length; i++){
            int count = 0;
            for(int j = 0; j < A.length; j++){
                if(C[i] == A[j]){
                    count++;
                }
            }

            System.out.println(C[i] + ": " + count);

            if(max_count <= count){
                if(max_count < count){
                    //Если временно присваиваем индекс элекнта, который чазе всего встречается в отличии от других
                    temp_val = i;
                    min_value = C[temp_val];
                }else {
                    //В том случае если нашлось такое число, которое встречается столько раз сколько и , допустим, прошлое число
                    if(C[temp_val] > C[i]){
                        //Присваиваем наименьшее из чисел
                        min_value = C[i];
                    }
                }
                max_count = count;
            }
        }

        System.out.println("Наиболее (в случае нескольких чисел число - наименьшее) часто " +
                "встречающее число: " + min_value);
    }
}
