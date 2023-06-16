package one_dimensional_arrays;

public class Sixth_Task {

    public static void main(String[] args){
        double[] A = {-7.4, -3.85, 0, 15, 24.55, 77.55 };
        double sum = 0;
        int count = 0;

        for(int i = 0; i < A.length; i++){
            for(int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println("i = " + i + ". " + A[i]);
                sum = sum + A[i];
            }

            count = 0;
        }

        System.out.println("Sum = " + sum);
    }
}
