package lesson5.task1;

public abstract class Animal {
    protected String name; // кличка животного
    protected String type; // парода животного
    protected int run; // возможность бегать, метры возможного бега
    protected int swims; // возможность плавать, метры возможного плавания
    private static int count = 0; // количество созданных животных

    public Animal(String name, String type, int run, int swims) {
        this.name = name;
        this.type = type;
        this.run = run;
        this.swims = swims;
        count++;
    }

    public static int getCount() {
        return count;
    }

    protected abstract void run(int distance);

    protected abstract void swim(int distance);

    @Override
    public String toString() {
        return "Кличка: " + name + " порода: " + type +
                " может пробежать: " + run + "м. " +
                " может проплыть: " + swims + "м. \n";
    }
}

