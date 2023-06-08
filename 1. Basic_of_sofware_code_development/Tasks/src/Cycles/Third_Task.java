package Cycles;

public class Third_Task {
    public static void main(String[] args){
        int Sum = 0;

        for (int i = 1; i <= 100;  i++){
            Sum = (int) (Sum + Math.pow(i, 2));
        }
        System.out.println("Sum = " + Sum);
    }
}
