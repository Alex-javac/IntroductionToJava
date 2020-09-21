package by.Algorithmization.arrays;

import java.util.Scanner;

//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class Task6 {
    public static void task6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задана последовательность N вещественных чисел.");
        System.out.print("N = ");
        int lengthArr = scanner.nextInt();
        double[] arr = new double[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double)(Math.random() * 100-10);
        }

        int sum = 0;
        for (int i = 1; i <= arr.length-1; i++) {
            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
                sum+=arr[i];
            }
        }
        System.out.println("Сумма чисел (порядковые номера которых являются простыми числами) = "+sum);

    }
}
