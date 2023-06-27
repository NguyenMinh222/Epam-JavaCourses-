package decomposition;

public class Seven_Task {

    /*Написать метод(методы) для вычисления суммы фаториалов всех нечетных чисел от 1 до 9*/

    public static void main(String[] args){
        int sum = 0;
        int numbers = 9;

        for(int i = 1; i <= numbers; i++){
            if(i % 2 != 0){
                sum += Factorial(i);
            }
        }

        System.out.println("The sum of factorials of odd numbers is: " + sum);
    }

    static int Factorial(int number){
        int factorialOfNumber = 1;

        for (int i = 1; i <= number; i++){
            factorialOfNumber *= i;
        }
        return factorialOfNumber;
    }
}
