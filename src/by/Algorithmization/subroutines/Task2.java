package by.Algorithmization.subroutines;

import static by.Algorithmization.subroutines.Task1.gcd;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Task2 {
    public static int gcdFor4Num(int a,int b,int c,int d){
        return gcd(gcd(gcd(a, b), c), d);
    }
}
