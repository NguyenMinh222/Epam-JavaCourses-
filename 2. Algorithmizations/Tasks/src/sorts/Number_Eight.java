package sorts;

public class Number_Eight {
    /*Даны дроби. Составить программу, которая приводит эти дроби к общему
    * знаменателю и упорядочивает их в порядке возрастания.*/
    public static void main(String[] args){

        int[] numerators = {5, 8, 4, 2};
        int[] denominator = {8, 9, 6, 13};
        int[] fraction = new int[numerators.length];
        int i, j;

        System.out.println("Source fractions:");
        for(i = 0; i < numerators.length; i++){
            System.out.print(numerators[i] + "/" + denominator[i] + " ");
        }

        //Ищем НОК
        int commonDenominator = findCD(denominator);
        System.out.println("\n\nCommon denominator of numbers: " + commonDenominator);

        //Добавляем вычисленные значения дробей с общим знаменателем для сортировки в дальнейшем
        for(i = 0; i < fraction.length; i++){
            fraction[i] = (commonDenominator / denominator[i]) * numerators[i];
        }

        //Сортировка по возрастанию
        Sort(fraction, numerators, denominator);

        System.out.println("\nSorted fractions (and the calculated value of the common denominator):");
        for(i = 0; i < fraction.length; i++){
            System.out.print(numerators[i] + "/" + denominator[i]);
            System.out.print("(" + fraction[i] + ")" + " ");
        }
    }

    static int findCD(int[] denominator){
        int temp_commonDenominator = denominator[0];
        for(int i = 1; i < denominator.length ; i++){
            temp_commonDenominator = LeastCommonMultiple(temp_commonDenominator, denominator[i]);
        }
        return temp_commonDenominator;
    }

    //Наименьшее общее кратное можно искать по формуле через НОД
    static int LeastCommonMultiple(int a, int b){
        return (a * b)/(GreatestCommonDivision(a, b)) ;
    }

    //НОД. Рекурсивно вызывается до тех пор, пока a % b  не будет равно нулю. В таком
    //случае этот b и будет нашим НОД. Например 16 и 8. 16 % 8 == 0 (без остатка). выходит
    //8 является НОД
    static int GreatestCommonDivision(int a, int b){
        if(b == 0){
            return a;
        }else{
            return GreatestCommonDivision(b, a % b);
        }
    }

    static void Sort(int[] fraction, int[] numerators, int[] denominators){
        int temp, j, i;
        int temp_numerators, temp_denominators;

        for(i = 0; i < fraction.length; i++){
            for(j = 0; j < fraction.length - 1; j++){
                if(fraction[j] > fraction[j + 1]){
                    temp = fraction[j];
                    fraction[j] = fraction[j + 1];
                    fraction[j + 1] = temp;

                    temp_numerators = numerators[j];
                    numerators[j] = numerators[j + 1];
                    numerators[j + 1] = temp_numerators;

                    temp_denominators = denominators[j];
                    denominators[j] = denominators[j + 1];
                    denominators[j + 1] = temp_denominators;
                }
            }
        }
    }
}
