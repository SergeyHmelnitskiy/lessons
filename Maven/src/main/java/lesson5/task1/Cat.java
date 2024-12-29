package lesson5.task1;

public class Cat extends Animal{
    private static final int CAT_RUN_LIMIT = 200; // лимит для бега
    private static final int CAT_SWIM_LIMIT = 0; // не умеет плавать
    private static int count = 0; // подсчет котов
    private boolean isFull = false; // параметр сытости, кот по умолчанию голодный

    public Cat(String name, String type) {
        super(name, type, CAT_RUN_LIMIT, CAT_SWIM_LIMIT);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else if (distance <= run) {
            System.out.println(name + " пробежал " + distance + "м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м.");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной");
        } else {
            System.out.println(name + " не умеет плавать");
        }
    }

    public static int getCount() {
        return count;
    }

    public void eatCat(Bowl bowl, int foodAmount) {
        if (foodAmount < 0) {
            System.out.println("Количество еды не может быть отрицательным");
        } else if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            this.isFull = true;
            System.out.println(name + " поел " + foodAmount + " единиц ед.");
        } else {
            System.out.println("не хватает еды в миске");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
