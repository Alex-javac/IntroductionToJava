package by.lesson1.cycles;
//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task15 {
    public static void task15() {
        System.out.println("Найти произведения квадратов первых двухсот чисел");
        int result1 = 0;
        for(int i = 1; i <= 200; i++) {
            result1 *=Math.pow(i,2);
        }
        System.out.println("Произведения квадратов первых двухсот чисел = "+result1);
    }
}
