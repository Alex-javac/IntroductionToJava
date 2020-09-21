package by.Algorithmization.arrays;

import java.util.Scanner;

//Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class Task3 {
    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Дан массив действительных чисел, размерность которого N.");
        System.out.print("N = ");
        int lengthArr = scanner.nextInt();
        double[] arr = new double[lengthArr];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) (Math.random()* 10 - 5);
        }

        int countPositive = 0;
        int countNull = 0;
        int countNegative = 0;

        for (double element : arr) {
            if (element > 0) {
                countPositive++;
            }
            if (element == 0) {
                countNull++;
            }
            if (element < 0) {
                countNegative++;
            }
        }
        System.out.println("Количество положительных чисел в массиве = " + countPositive);
        System.out.println("Количество нулевых чисел в массиве = " + countNull);
        System.out.println("Количество отрицательных чисел в массиве = " + countNegative);
    }
}

