package by.Basics.linearProgram;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

import java.util.Scanner;

public class Task5 {
    public static String valueTask5(long time){
        long hours;
        long minutes;
        long seconds;
        hours = time / 3600;
        minutes = (time - hours * 3600) / 60;
        seconds = time - hours * 3600 - minutes * 60;
        return hours+"ч "+minutes+"мин "+seconds+"с";
    }
    public static void task5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число Т, которое представляет длительность прошедшего времени в секундах.");
        System.out.print("T = ");
        int time = scanner.nextInt();
        System.out.println("Вывести данное значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc");
        System.out.println(valueTask5(434535434));

    }
}
