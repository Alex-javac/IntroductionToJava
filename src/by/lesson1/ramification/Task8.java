package by.lesson1.ramification;

import java.util.Scanner;

//Найти max{min(a, b), min(c, d)}
public class Task8 {
    public static void task8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Найти max{min(a, b), min(c, d)}");
        System.out.print("а = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();

        int result= Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("Результат = "+result);
    }

}
