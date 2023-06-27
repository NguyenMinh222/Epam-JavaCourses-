package decomposition;

import java.util.Random;

public class Task_Six {

    public static void main(String[] args){
        checkPrimeNumbers();
    }

    static int[] Array(){
        int[] A = new int[3];
        Random rnd = new Random();

        for (int i = 0; i < 3; i++){
            A[i] = rnd.nextInt(2, 1001);
            System.out.print(A[i] + " ");
        }
        System.out.println();

        return A;
    }

    //Проверка на взаимо простые числа, если нет то генерируем новых три числа на проверку.
    static void checkPrimeNumbers(){

        int[] A = Array();

        if(!MutuallyPrimeNumbers(A)){
            System.out.println("This is are not mutually numbers.");
            Array();
        }

        System.out.println("This is are mutually numbers.");
    }

    //Взаимные простые числа - это числа которые не имеют никаких общих делителей кроме 1
    static boolean MutuallyPrimeNumbers(int[] A){

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                //Проверка первого числа со вторым и третьим и второго числа с третьим
                if (greatestCommonDivision(A[i], A[j]) != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    //Ищем нод(привести в пример можно будет числа 866, 489б 259)
    static int greatestCommonDivision(int a, int b){
        if(b == 0){
            return a;
        }

        return  greatestCommonDivision(b, a % b);
    }
}
