package two_dimensional_arrays;

import static java.lang.Math.random;

public class test {
    public static void main(String[] args) {
        int n = 3; // размерность квадрата
        int[][] square = new int[n][n];

        int row = 0;
        int col = n / 2;
        for (int i = 1; i <= n * n; i++) {
            square[row][col] = i;
            row--;
            col++;
            if (row < 0 && col < n) {
                row = n - 1;
            } else if (col == n && row >= 0) {
                col = 0;
            } else if (row < 0 && col == n) {
                row = 0;
                col = n - 2;
            } else if (square[row][col] != 0) {
                row++;
                col--;
            }
        }

        // Вывод квадрата на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
