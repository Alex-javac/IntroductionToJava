package by.Algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка вставками. Дана последовательность чисел a1, a2...an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2...ai - упорядоченная последовательность, т. е.
a1<=a2...<=an . Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {
    public static void task5() {
        int[] arr = {4, 7, 6, 3, 1, 2, 5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int index = Search(arr, i);
            int temp = arr[i];
            for (int j = i; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    private static int Search(int[] array, int i) {
        int low = 0;
        int key = array[i];
        int hight = i;
        while (low < hight)
        {
            int middle = (hight + low) / 2;
            if (array[middle] > key)
                hight = middle;
            else
                low = middle + 1;
        }
        return low;
    }
}
