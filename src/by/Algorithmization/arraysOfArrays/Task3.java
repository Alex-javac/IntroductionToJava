package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task3 {
    public static void task3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Дана матрица.");
        int[][] matrix=new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Вывести k-ю строку и p-й столбец матрицы.");

        System.out.print("k = ");
        int line = scanner.nextInt();
        for (int j = 0; j < matrix[line-1].length; j++) {
            System.out.print(matrix[line-1][j] +" ");
        }

        System.out.println();

        System.out.print("p = ");
        int column = scanner.nextInt();
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if (j == column - 1) {
                    System.out.println(ints[j]);
                }
            }
        }
    }
}

