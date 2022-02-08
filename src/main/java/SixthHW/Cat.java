package SixthHW;

public class Cat extends Animal{

    public static final int RUN_LIMIT = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= RUN_LIMIT) {
            System.out.printf("Cat %s run %s meters.\n", name, length);
        }
        else {
            System.out.printf("Cat %s run only %s meters.\n", name, RUN_LIMIT);
        }
    }

    @Override
    public void swimm(int length) {
        System.out.printf("Cat %s can't swimm.\n", name);
    }
}
