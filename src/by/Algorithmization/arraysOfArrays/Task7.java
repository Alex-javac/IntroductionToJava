package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;
//Сформировать квадратную матрицу порядка N по правилу:
//A[I,J] = sin{(I*I - J*J)/N}
//и подсчитать количество положительных элементов в ней.
public class Task7 {
    public static void task7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).");
        System.out.print("n = ");
        int n = scanner.nextInt();
        int count=0;
        if(n%2==0){
            double[][] matrix = new double[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Math.sin((Math.pow(i,2)-Math.pow(j,2))/n);
                    if(matrix[i][j]>0)
                        count++;
                }
            }
            for (double[] doubles : matrix) {
                System.out.println(Arrays.toString(doubles));
            }
            System.out.println("Количество положительных элементов = "+count);
        }else {
            System.out.println("n не соответствует условию");
            task7();
        }
    }
}
