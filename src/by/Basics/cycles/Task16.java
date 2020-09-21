package by.Basics.cycles;

import java.util.Scanner;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:a(n) = 1/(2^n) + 1/(3^n)
public class Task16 {
    public static void task16(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Даны числовой ряд и некоторое число е.");
        System.out.println("Найти сумму тех членов ряда, модуль которых больше или равен заданному е.");
        System.out.print("Числовой ряд = ");
        double n = scanner.nextDouble();
        System.out.print("Число е = ");
        double e = scanner.nextDouble();

        double result =0;
        for(int i=1; i<=n; i++) {
            double a;
            a = 1/(Math.pow(2,i)) + 1/(Math.pow(3,i));
            if(Math.abs(a) >= e) {
                result += a;
            }
        }
        System.out.println("Результат = "+ result);

    }
}
