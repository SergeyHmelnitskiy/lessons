package lesson5.task1;

public class lesson5task1 {
    public static void main(String[] args) {
        // создаем массив котов и собак
        Animal[] animals = {
                new Dog("Бобик", "бульдог"),
                new Cat("Мурзик", "сиамский"),
                new Dog("Шарик", "терьер"),
                new Cat("Барсик", "персидский")
        };

        // всем животным передаем дистанции для бега и плаванья
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        // выводим количество животных, собак, котов
        int animalCount = Animal.getCount();
        System.out.println("Всего животных: " + animalCount);
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println("Всего котов: " + Cat.getCount());

        // проверка задания с миской, создаем массив котов и просим все котов покушать
        Cat[] cats = {
                new Cat("Мурзик", "персидский"),
                new Cat("Барсик", "обычный"),
                new Cat("Васька", "лысый") };
        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eatCat(bowl, 10);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }

        bowl.addFood(10);
        cats[2].eatCat(bowl, 10);
        System.out.println(cats[2].name + " сытость: " + cats[2].isFull());
    }
}

