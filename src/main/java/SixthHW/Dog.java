package SixthHW;

public class Dog extends Animal{

    public static final int RUN_LIMIT = 500;
    public static final int SWIMM_LIMIT = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= RUN_LIMIT) {
            System.out.printf("Dog %s run %s meters.\n", name, length);
        }
        else {
            System.out.printf("Dog %s run only %s meters.\n", name, RUN_LIMIT);
        }
    }

    @Override
    public void swimm(int length) {
        if (length <= SWIMM_LIMIT) {
            System.out.printf("Dog %s swimm %s meters.\n", name, length);
        }
        else {
            System.out.printf("Dog %s swimm only %s meters.\n", name, SWIMM_LIMIT);
        }
    }

}
