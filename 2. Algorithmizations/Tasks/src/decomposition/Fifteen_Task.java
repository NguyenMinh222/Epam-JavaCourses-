package decomposition;

public class Fifteen_Task {

    /*Найти все натуральные n-числа , цифры которых образуют строго возрастающую последовательность
    * например (1234,5789)*/
    public static void main(String[] args){
        final int N = 10000;
        createArray(N);
    }

    static boolean findStrictlyIncreasingSequence(int number){
        String str_number = String.valueOf(number);
        char[] char_array = str_number.toCharArray();
        int i, count = 0;
        int n = char_array.length;

        for (i = 0; i < n - 1; i++){
            int first_number = Character.getNumericValue(char_array[i + 1]);
            int second_number = Character.getNumericValue(char_array[i]);
            if( first_number - second_number  == 1){
                count++;
            }
        }

        if(count == n - 1 && n != 1){
            return true;
        }else {
            return false;
        }
    }

    static void createArray(int N){
        int[] A = new int[N];
        int i, j = 0;

        System.out.println("StrictlyIncreasingSequence: ");
        for(i = 0; i < A.length; i++){
            A[i] = i + 1;
            if(findStrictlyIncreasingSequence(A[i])){
                System.out.println(++j + ": " +A[i]);
            }
        }
    }
}
