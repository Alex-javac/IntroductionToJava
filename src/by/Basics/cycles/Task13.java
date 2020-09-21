package by.Basics.cycles;

import java.util.Scanner;

//Вычислить значения функции на отрезке [а,b] c шагом h:
// y= x, x>2
//y =-x, x<=2
public class Task13 {
    public static void task13() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычислить значения функции на отрезке [а,b] c шагом h:");
        System.out.print("а = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("h = ");
        double h = scanner.nextDouble();

        double result=0;
        for(double i =a; i<=b; i+= h) {
            result = i > 2 ? i : -i;
        }
        System.out.println("Значения функции = "+result);
    }
}
