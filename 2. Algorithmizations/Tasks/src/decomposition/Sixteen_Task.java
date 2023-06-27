package decomposition;

public class Sixteen_Task {
    public static int sum = 0;

    public static void main(String[] args){
        int N = 1000;
        createArray(N);
    }

    static boolean checkOddDigitsInNumber(int number){
        String str_number = String.valueOf(number);
        char[] number_array = str_number.toCharArray();
        int i, k, count = 0;

        for (i = 0; i < number_array.length; i++){
            k = Character.getNumericValue(number_array[i]);
            if(k % 2 == 1){
                count++;
            }
        }

        if(count == number_array.length){
            return true;
        }
        else{
            return false;
        }
    }

    static void createArray(int N){
        int[] A = new int[N];
        int i, j = 0;

        for(i = 0; i < A.length; i++){
            A[i] = i + 1;
            if(checkOddDigitsInNumber(A[i])){
                sum += A[i];
            }
        }

        System.out.println("The sum of all numbers with odd digits is: " + sum);

        numbersOfDigitsInSum();
    }

    static void numbersOfDigitsInSum(){
        String str_sum = String.valueOf(sum);
        char[] sum_array = str_sum.toCharArray();
        int i, k, count = 0;

        for (i = 0; i < sum_array.length; i++){
            k = Character.getNumericValue(sum_array[i]);
            if(k % 2 == 0 && k != 0){
                count++;
            }
        }

        System.out.println("There are " + count + " even digits in sum.");
    }
}
