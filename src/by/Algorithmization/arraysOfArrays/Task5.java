package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;
//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).
// 1   1   1  ...  1   1   1
// 2   2   2  ...  2   2   0
// 3   3   3  ...  3   0   0
// .........................
//n-1 n-1  0  ...  0   0   0
// n   0   0  ...  0   0   0
public class Task5 {
    public static void task5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).");
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n%2==0){
            int[][] matrix=new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                   if(matrix.length-j <= matrix.length-i)
                    matrix[i][matrix.length-1-j] = i+1;
                   else
                       matrix[i][j] = 0;
                }
            }
            for (int[] ints : matrix) {
                System.out.println(Arrays.toString(ints));
            }
        }else {
            System.out.println("n не соответствует условию");
            task5();
        }
    }
}
