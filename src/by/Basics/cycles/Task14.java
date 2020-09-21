package by.Basics.cycles;

import java.util.Scanner;

//Найти сумму квадратов первых ста чисел.
public class Task14 {
    public static void task14() {
        System.out.println("Найти сумму квадратов первых ста чисел.");
        int result1 = 0;
        for(int i = 1; i <= 100; i++) {
            result1 +=Math.pow(i,2);
        }
        System.out.println("Сумма квадратов первых ста чисел = "+result1);

        System.out.println("Менее ресурсозатратный вариант без цикла");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Найти сумму квадратов N чисел.");
        System.out.print("N = ");
        int n = scanner.nextInt();
        int result2 = 0;
        result2=(n*(n+1)*(2*n+1))/6;
        System.out.println("Сумма квадратов "+n+" чисел = "+result2);

    }
}
