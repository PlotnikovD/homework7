package homework7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Борис", 10);
        Cat secCat = new Cat("Олег", 15);
        Cat spiderCat = new Cat("Человек кот", 30);
        Plate plate = new Plate(47);

        Cat[] cats = new Cat[3];
        cats[0] = cat;
        cats[1] = secCat;
        cats[2] = spiderCat;

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            if (plate.getFood() > cats[i].getAppetite()) {
                cats[i].setSatiety(true);
                System.out.println(cats[i].isSatiety());
                System.out.println("Кот " + cats[i].getName() + " наелся, съев " + cats[i].getAppetite() + " ед. корома");
            } else {
                System.out.println(cats[i].isSatiety());
                System.out.println("Коту " + cats[i].getName() + " не хватает " + (cats[i].getAppetite() - plate.getFood()) + " ед. корома");
            }
        }

        plate.addFood(20);
        plate.plateInfo();

    }
}
