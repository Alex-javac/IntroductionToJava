package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.
public class Task9 {
    public static void task9(){


        System.out.println("Задана матрица неотрицательных чисел.");
        int[][] matrix=new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Посчитать сумму элементов в каждом столбце.");
        int[] sumElement= new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum+=matrix[j][i];
            }
            sumElement[i]=sum;
        }
        System.out.println(Arrays.toString(sumElement));
        System.out.println("Определить, какой столбец содержит максимальную сумму.");
        int maxNumb=sumElement[0];
        int maxIndex=0;
        for (int i = 0; i < sumElement.length; i++){
            if (sumElement[i]>maxNumb){
                maxNumb=sumElement[i];
                maxIndex = i;
            }
        }
        System.out.println("Столбей №"+(maxIndex+1)+" содержит максимальную сумму.");
    }
}
