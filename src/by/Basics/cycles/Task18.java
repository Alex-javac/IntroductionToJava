package by.Basics.cycles;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Task18 {
    public static void task18() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.");
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n > m) {
            for (int i = m; i<=n; i++) {
                for (int j = 2; j < i; j++){
                    if(i%j == 0) {
                        System.out.println("Делитель числа " + i + " = " +j);
                    }
                }
            }

        } else {
            System.out.println("Введенные числа некорректны");
            task18();
        }
    }
}
