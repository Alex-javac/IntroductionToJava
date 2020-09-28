package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

//Сформируйте случайную матрицу mxn,
//состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
public class Task14 {
    public static void task14() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сформируйте случайную матрицу mxn");
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        if(m>=n && m>0 && n>0) {
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix.length - j <= matrix.length - i)
                        matrix[i][j] = 1;
                    else
                        matrix[i][j] = 0;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }else {
            System.out.println("Условие выполнимо только при (m>=n и m>0 и n>0)");
            task14();
        }
    }
}
