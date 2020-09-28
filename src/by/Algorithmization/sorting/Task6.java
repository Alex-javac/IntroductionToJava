package by.Algorithmization.sorting;

import java.util.Arrays;
/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1). Если a(i)<=a(i+1),
то продвигаются на один элемент вперед. Если a(i)>a(i+1) , то производится перестановка и сдвигаются
на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Task6 {
    public static void task6() {
        int[] arr = {4, 7, 6, 3, 1, 2, 5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length-1 ;) {
            if(arr[i]>arr[i+1]){
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
                if(i>0){
                    i--;
                }
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
