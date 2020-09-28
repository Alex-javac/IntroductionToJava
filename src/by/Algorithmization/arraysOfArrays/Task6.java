package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1 1 1 ... 1 1 1
 0 1 1 ... 1 1 0
 0 0 1 ... 1 0 0
 ...............
 0 1 1 ... 1 1 0
 1 1 1 ... 1 1 1
 */
public class Task6 {
    public static void task6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).");
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n%2==0){
            int[][] matrix=new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(i <= j && j <= matrix.length-1-i)
                        matrix[i][j] = 1;
                    else if (i >= j && j >= matrix.length-1-i)
                        matrix[i][j] = 1;
                    else
                        matrix[i][j] = 0;
                }
            }
            for (int[] ints : matrix) {
                System.out.println(Arrays.toString(ints));
            }
        }else {
            System.out.println("n не соответствует условию");
            task6();
        }
    }
}
