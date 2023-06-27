package decomposition;

public class Nine_Task {
    /*Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод(методы)
    * вычисления его площади, если угол между сторонами длиной X и Y - прямой*/
    public static void main(String[] args){
        int X = 6;
        int Y = 8;
        int Z = 5;
        int T = 7;

        //гипотенуза дл второго треугольника
        double C = Math.sqrt(Math.pow(Y, 2) + Math.pow(X, 2));

        //Поскольку четырехугольник с прямым углом может иметь два острых угла и один тупой, то ищем
        //площадь его по двум треугольникам(по площадь прямоугольного треугольника и по формуле Герона)

        System.out.println("The square of quadrilateral: " + Square(C, Z, T, X, Y));
    }

    static double Square(double C, int Z, int T, int X, int Y){
        //Площадь первого треугольника
        double S1 = (double)(X * Y) / 2;

        //Полупериметр
        double p = (Z + T + C) / 2;
        //Площадь второго треугольника
        double S2 = Math.sqrt(p * (p - Z) * (p - T) * (p - C));

        return S2 + S1;
    }
}
