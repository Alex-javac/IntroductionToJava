package by.Algorithmization.subroutines;

import static by.Algorithmization.subroutines.Task1.gcd;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Task6 {
    public static void task6(){
int one =70;
int two =280;
int three =43;
//целые числа взаимно просты, если их НОД равен 1.
int result = gcd(one,gcd(two,three));
if(result==1){
    System.out.println("Данные три числа являются взаимно простыми.");
}else {
    System.out.println("Данные три числа не являются взаимно простыми.");
}
    }
}
