package SeventhHW;

public class SeventhHW {
    public static void main(String[] args) {

        Plate plate = new Plate(50);
        Cat[] catsArray = new Cat[3];

        catsArray[0] = new Cat("Barsik", 20);
        catsArray[1] = new Cat("Gosha", 10);
        catsArray[2] = new Cat("Tom", 25);

        catEat(catsArray, plate);

    }

    public static void catEat (Cat arr[], Plate plate) {
        for (int i = 0; i < arr.length; i++) {
            plate.info();
            arr[i].eat(plate);
            plate.info();
            arr[i].status();
            System.out.println("\n");
        }
    }

}
