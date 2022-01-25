package SecondHW;

public class SecondHW {
    public static void main(String[] args) {
        System.out.println(numbers10and20(20, 5));
        positiveOrNegative(-1);
        System.out.println(negative(-55));
        printWordNTimes("Hello!", 5);


    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false. */

    public static boolean numbers10and20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом. */

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное.");
        } else {
            System.out.println("Число " + a + " отрицательное.");
        }
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false
    если положительное. */

    public static boolean negative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз. */

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }


}
