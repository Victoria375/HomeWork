package SeventhHW;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite) == true) {
            satiety = true;
        } else {
            plate.increaseFood(appetite);
            plate.decreaseFood(appetite);
            satiety = true;
        }
        System.out.printf("Кот съел %s еды.\n", appetite);
    }

    public void status() {
        System.out.println(satiety);
    }

}

