package by.Basics.linearProgram;

import java.util.Scanner;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (sin x + cos x)/(cos x - sin y)*tg(x*y)
public class Task3 {
    public static double valueTask3(double x ,double y){
        double result = ((Math.sin(x) + Math.cos(y))/(Math.cos(x)- Math.sin(y)))* Math.tan(x * y);
        return result;
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычислить значение выражения по формуле: (sin x + cos x)/(cos x - sin y)*tg(x*y)");
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();

        System.out.println("Значение выражения = "+ valueTask3(x,y));
    }
}
