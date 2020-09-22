package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
   1   2     3  ...n
   n (n-1) (n-2)...1
   1   2     3  ...n
   n (n-1) (n-2)...1
   ................
   n (n-1) (n-2)...1
 */
public class Task4 {
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).");
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n%2==0){
        int[][] matrix=new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if (i%2!=0){
                matrix[i][j] =n-j;
               }
               else {
                   matrix[i][j]=j+1;
               }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }else {
            System.out.println("n не соответствует условию");
            task4();
        }
    }
}
