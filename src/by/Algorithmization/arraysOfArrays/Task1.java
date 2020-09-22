package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
public class Task1 {
    public static void task1(){
        System.out.println("Дана матрица.");
       int[][] matrix=new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[0][j]>matrix[matrix.length-1][j] && j%2!=0){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("]");
        }

    }
}
