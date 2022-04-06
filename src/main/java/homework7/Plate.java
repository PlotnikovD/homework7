package homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void descreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
        } else {
            System.out.println("В тарелке нет столько еды.");
        }
    }

    public void addFood(int add) {
        food += add;
        System.out.println("В тарелку добавлено " + add + " ед. еды.");
    }

    public void plateInfo() {
        System.out.println("В тарелке находится " + food + " ед. еды.");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
