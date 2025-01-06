package lesson5.task1;

public class Bowl {
    private int food;

    public Bowl(int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount < 0) {
            System.out.println("Количество еды не может быть отрицательным");
        } else if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в миске");
        }
    }

    public void addFood(int amount) {
        if (amount < 0) {
            System.out.println("Количество еды не может быть отрицательным");
        } else {
            food += amount;
            System.out.println("добавили " + amount + " единиц ед.");
        }
    }
}
