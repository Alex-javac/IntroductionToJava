package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;

//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void task10(){
        System.out.println("Дана матрица.");
        int[][] matrix=new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10-5);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Найти положительные элементы главной диагонали квадратной матрицы.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0;j<i;j++){
                System.out.print("\t");
            }
            if (matrix[i][i]>0)
                System.out.println(matrix[i][i]);
            else
                System.out.println("*");
        }
    }
}
