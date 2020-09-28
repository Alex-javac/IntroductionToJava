package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2^n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.Пример магического квадрата порядка 3:
                                          6 1 8
                                          7 5 3
                                          2 9 4
 */
public class Task16 {
    public static void task16() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Построим магический квадрат порядка n");
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int length = matrix.length;
        int magicConstant = n * (n * n + 1) / 2;
        System.out.println("Магическая константа =" + magicConstant);

        if (length % 4 == 0) {
            for (int i = 0; i <length/2 ; i++) {
                for (int j = 0; j <length/2 ; ) {
                    if(i % 2 == 0) {
                        matrix[i][j] = -1;
                        matrix[i][length-1-j] = -1;
                        j+=2;
                    } else { if(j>0 && j%2!=0) {
                        matrix[i][j] = -1;
                        matrix[i][length-1-j] = -1;
                    }
                        j++;
                    }
                }
            }
            int counter =1;
            for (int i = 0; i <length/2 ; i++) {
                for (int j = 0; j <length ; j++) {
                    if(matrix[i][j]==-1){
                        matrix[i][j] = length*length+1-counter;
                        matrix[length -i - 1][length - j - 1] = counter;
                    }
                    if(matrix[i][j] == 0){
                        matrix[i][j] = counter;
                        matrix[length-i - 1][length - j -1] = length*length+1-counter;
                    }
                    counter++;
                }
            }


        }
        else if(length % 2 == 0){
            System.out.println("В процессе разработки");
        } else {
            int valueOfIteration = length*length;
            int rowPosition = 0;//стартовые позиции
            int columnPosition = length/2;// стартовые позиции
            matrix[rowPosition][columnPosition] =1;
            int counter = 2;
            for (int i = 0; i < valueOfIteration-1;i++) {
                rowPosition--;
                columnPosition++;
                //По диагонали
                if(rowPosition == -1&& columnPosition == length){
                    rowPosition +=2;
                    columnPosition --;
                }
                //Сверху
                if(rowPosition==-1){
                    rowPosition = length-1;
                }
                //Сбоку
                if(columnPosition==length){

                    columnPosition =0;
                }
                //Клетка занята
                if(matrix[rowPosition][columnPosition]!=0){

                    columnPosition--;
                    rowPosition+=2;
                }
                matrix[rowPosition][columnPosition] =counter;
                counter++;
            }

        }
        for (int[] ints : matrix) {
            int sum = 0;
            for (int element : ints) {
                sum += element;
            }
            System.out.println(Arrays.toString(ints) + " | [" + sum + "]");
        }
        int[] sumElement= new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int[] ints : matrix) {
                sum += ints[i];
            }
            sumElement[i]=sum;
        }
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(sumElement));
    }
}
