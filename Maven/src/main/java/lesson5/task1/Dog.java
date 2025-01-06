package lesson5.task1;

public class Dog extends Animal {
    private static final int DOG_RUN_LIMIT = 500; // лимит для бега
    private static final int DOG_SWIM_LIMIT = 10; // лимит для плавания
    private static int count = 0; // подсчет собак

    public Dog(String name, String type) {
        super(name, type , DOG_RUN_LIMIT, DOG_SWIM_LIMIT);
        count++;
    }

    @Override public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной.");
        } else if (distance <= run) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной.");
        } else if (distance <= swims) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getCount() {
        return count;
    }
}
