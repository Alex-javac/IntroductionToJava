package by.Algorithmization.subroutines;
//Написать метод(методы) для нахождения наибольшего общего делителя(НОД) и наименьшего общего кратного двух натуральных чисел.
public class Task1 {
//НОД - наибольшее число, которое является делителем одновременно для чисел a и b. Реализация (Алгоритм Евклида):
    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
//НОК - наименьшее число, которое делится на a и b без остатка
    public static int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }
}
