package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static void task12() {
        System.out.println("Отсортировать строки матрицы по возрастанию и убыванию значений элементов.");
        Integer[][] matrix = new Integer[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Сортировка по возрастанию");
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Сортировка по убыванию");
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i], Collections.reverseOrder());
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
