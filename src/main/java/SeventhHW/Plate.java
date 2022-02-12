package SeventhHW;

public class Plate {

    public static final int MAX_FOOD = 60;
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food: " + food);
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void increaseFood (int amount) {
        if (amount > food) {
            food += (MAX_FOOD - food);
            System.out.println("В тарелку добавили еды.");
        }
    }

}

