package by.lesson1.ramification;

import java.util.Scanner;

//Вычислить значение функции: если х<=3 F(x)=Math.pow(x,2)-3*x +9; Если x>3 F(x) = 1/(Math.pow(x,3)+6)
public class Task11 {
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычислить значение функции: если х<=3 F(x)=Math.pow(x,2)-3*x +9; Если x>3 F(x) = 1/(Math.pow(x,3)+6)");
        System.out.println("x =");
        double x = scanner.nextDouble();

        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else if (x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        }else {
            System.out.println("Ошибка!");
            return;}
        System.out.println("Значение функции = "+result);
    }
}
