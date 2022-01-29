package ThirdHW;

public class ThirdHW {
    public static void main(String[] args) {

        /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
        заменить 0 на 1, 1 на 0 */
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        print(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        print(arr);

        System.out.println("\n");

        /* 2. Задать пустой целочисленный массив длиной 100. С помощью цикла
        заполнить его значениями 1 2 3 4 5 6 7 8 … 100 */
        int[] array = new int[100];
        print(array);
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num++;
        }
        System.out.println();
        print(array);

        System.out.println("\n");

        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
        по нему циклом, и числа меньшие 6 умножить на 2 */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        print(arr3);
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println();
        print(arr3);

        System.out.println("\n");

        /* 4. Создать квадратный двумерный целочисленный массив (количество
        строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
        диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по
        следующему принципу: индексы таких элементов равны, то есть [0][0],
        [1][1], [2][2], …, [n][n] */
        int[][] arr4 = new int[4][4];
        print2(arr4);
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
            }
        }
        System.out.println();
        print2(arr4);

        System.out.println("\n");




    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void print2(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
