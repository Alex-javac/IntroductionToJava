package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void task2(){
        System.out.println("Дана квадратная матрица.");
        int[][] matrix=new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Вывести на экран элементы, стоящие на диагонали.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0;j<i;j++){
                System.out.print("\t");
            }
            System.out.println(matrix[i][i]);
        }
    }
}
