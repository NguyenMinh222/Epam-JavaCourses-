package linear_programs;

import java.util.Scanner;

public class Fifth_Task {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Введите количество секунд (число должно быть больше 0.) " );
            System.out.print("seconds = ");
            String number = input.next();

            try{
                int seconds = Integer.parseInt(number);
                if(seconds > 0){
                    int hours = seconds / 3600;
                    int minuts = (seconds / 60) % 60;
                    int new_seconds = seconds % 60;
                    System.out.println(hours + "ч " + minuts + "мин " + new_seconds + "с");
                }
                else {
                    System.out.println("Секунды не могут быть отрицательными.");
                }
            }catch (NumberFormatException e){
                System.out.println("Ошибка ввода данных!");
            }
        }
    }
}
