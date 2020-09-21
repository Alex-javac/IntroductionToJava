package by.Basics.linearProgram;

import java.util.Scanner;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(b + sqrt(b^2 + 4*a*c))/2a - a^3*c +(1/b^2)

public class Task2 {

    public static double valueTask2(double a, double b, double c) {
        double result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + (Math.pow(b, -2));
        return result;
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычислить значение выражения по формуле: (b + sqrt(b^2 + 4*a*c))/2a - a^3*c +(1/b^2)");
        System.out.print("а = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        System.out.println("Значение выражения = "+ valueTask2(a,b,c));
    }
}
