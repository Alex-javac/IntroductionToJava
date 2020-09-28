package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {
    public static void task15() {
        System.out.println("Дана матрица.");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.");
        int maxElement=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]>maxElement) {
                    maxElement=matrix[i][j];
                }
            }
        }
        System.out.println("Найдите наибольший элемент матрицы ="+maxElement);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2!=0) {
                    matrix[i][j]=maxElement;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
