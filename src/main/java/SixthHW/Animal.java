package SixthHW;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run (int length);

    public abstract void swimm (int length);
}
