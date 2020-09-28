package by.Algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка обменами. Дана последовательность чисел a1<=a2..<=an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1) . Если ai>a(i+1), то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void task4() {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1, 5, 2};
        int count=0;
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("количество перестановок =" + count);
    }
}