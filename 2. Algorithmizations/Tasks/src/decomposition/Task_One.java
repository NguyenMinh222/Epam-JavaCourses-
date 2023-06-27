package decomposition;

import java.util.Random;

public class Task_One {
    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt(101), b = random.nextInt(101);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("\nLeast common multiple of numbers: " + LCM(a, b));
        System.out.println("\nGreatest common division: " + GCD(a, b));

    }

    //нахождение НОК
    static int LCM(int a, int b){
        return (a * b)/GCD(a, b);
    }

    //НОД
    static int GCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return GCD(b, a % b);
        }
    }
}
