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



    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
