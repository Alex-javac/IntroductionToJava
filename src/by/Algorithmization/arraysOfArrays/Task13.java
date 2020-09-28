package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
    public static void task13() {
        System.out.println("Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int[] value : matrix) {
            System.out.println(Arrays.toString(value));
        }
        System.out.println("Сортировка по возрастанию");
        for (int i = 0; i < matrix.length; i++) {
            for (int z = 0; z < matrix.length; z++) {
                for (int j = 1; j < matrix.length; j++) {
                    if (matrix[j][i] > matrix[j - 1][i]) {
                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[j - 1][i];
                        matrix[j - 1][i] = tmp;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Сортировка по убыванию");
        for (int i = 0; i < matrix.length; i++) {
            for (int z = 0; z < matrix.length; z++) {
                for (int j = 1; j < matrix.length; j++) {
                    if (matrix[j][i] < matrix[j - 1][i]) {
                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[j - 1][i];
                        matrix[j - 1][i] = tmp;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
