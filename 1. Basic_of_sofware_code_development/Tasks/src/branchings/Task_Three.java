package branchings;

public class Task_Three {
    public static void main(String[] args){
        int x1 = 5;
        int y1 = 2;

        int x2 = 8;
        int y2 = 3;

        int x3 = 10;
        int y3 = 1;

        //Для того, чтобы определить, будут ли расположены точки на одной прямой
        //то нужно считать по формуле (x3 - x1)/(x2 - x1) - (y3 - y1)/(y2 - y1) ?= 0

        var result = Math.abs((x3 - x1)/(x2 - x1) - (y3 - y1)/(y2 - y1));
        if(result == 0){
            System.out.println("Точки лежат на одной прямой.");
        }else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }
}
