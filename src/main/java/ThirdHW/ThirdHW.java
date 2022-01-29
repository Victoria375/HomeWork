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
    }



    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }













}
