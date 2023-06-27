package decomposition;

import java.util.Random;
import java.util.Scanner;

public class Task_Four {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = isNum("n");
        int[] coords_X = coord_X_Y(n);
        int[] coords_Y = coord_X_Y(n);

        print_coord(coords_X, coords_Y);

        System.out.println("\nThe max distance between points:");
        printMaxPair(maxDistanceBetweenPoints(coords_X,coords_Y), coords_X, coords_Y);
    }

    static void printMaxPair(double maxDistance, int[] coord_X, int[] coord_Y){
        int i, j;
        int distBetween_X_points, distBetween_Y_points;
        double distance;
        char letter = 65;

        for (i = 0; i < coord_X.length; i++){
            for (j = i; j < coord_X.length; j++){
                if(i != j){
                    distBetween_X_points = coord_X[i] - coord_X[j];
                    distBetween_Y_points = coord_Y[i] - coord_Y[j];
                    distance =  Math.sqrt(Math.pow(distBetween_X_points, 2) + Math.pow(distBetween_Y_points, 2));
                    if(distance == maxDistance){
                       System.out.println((char) (letter + i) + ": (" + coord_X[i] + ", " + coord_Y[i] + ") and " + (char)(letter + j)
                              + ": (" + coord_X[j] + ", " + coord_Y[j] + ")");
                    }
                }
            }
        }
    }
    static double maxDistanceBetweenPoints(int[] coord_X, int[] coord_Y){
        int i, j;
        int distBetween_X_points, distBetween_Y_points;
        double distance, maxDistance = 0;

        for (i = 0; i < coord_X.length; i++){
            for (j = i; j < coord_X.length; j++){
                if(i != j){
                    distBetween_X_points = coord_X[i] - coord_X[j];
                    distBetween_Y_points = coord_Y[i] - coord_Y[j];
                    distance =  Math.sqrt(Math.pow(distBetween_X_points, 2) + Math.pow(distBetween_Y_points, 2));
                    if(distance >= maxDistance){
                        maxDistance = distance;
                    }
                }
            }
        }

        return maxDistance;
    }

    static void print_coord(int[] coord_X, int[] coord_Y){
        int j = 0;
        char letter = 65;

        while(j < coord_X.length){
            System.out.println(letter + ": (" + coord_X[j] + ", " + coord_Y[j] + ")");
            letter++;
            j++;
        }
    }
    static int[] coord_X_Y(int n){
        Random rnd = new Random();
        int[] temp = new int[n];
        int i = 0;

        while(i < n){
            temp[i] = rnd.nextInt(-10, 11);
            i++;
        }

        return temp;
    }

    static int isNum(String letter){
        while(true){

            System.out.print("Input the number of points on the plane " + letter + " = ");
            String number = input.next();

            try{
                if(Integer.parseInt(number) <= 1){
                    System.out.println("Pls, enter two or more number of points to solve the task.");
                }else{
                    return Integer.parseInt(number);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input data!");
            }
        }
    }
}
