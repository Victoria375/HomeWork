package FirstHW;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();

    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = -6;
        int b = 3;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
}

