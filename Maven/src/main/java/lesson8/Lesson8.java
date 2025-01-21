package lesson8;

import java.util.Map;
import java.util.Set;

public class Lesson8 {
    public static void main(String[] args) {
        // первое задание, создаем массив
        String[] words = {"planet", "yoga", "electrical", "aurora",
                "justice", "cube", "strain", "planet", "discount",
                "pony", "moth", "cube", "pony", "dragonfly"};

        WordProcessor wordProcessor = new WordProcessor(words);

        System.out.println("Уникальные слово: " +  wordProcessor.getUniqueWords());
        System.out.println("Количество вхождений каждого слова: " + wordProcessor.getCountWordOccurrences());

        // второе задание
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+375296132456");
        phoneBook.add("Петров", "+375446132456");
        phoneBook.add("Иванов", "+375336132321");
        phoneBook.add("Козлов", "+375443332456");
        phoneBook.add("Бобров", "+375295552456");

        System.out.println("Иванов :" + phoneBook.get("Иванов"));
        System.out.println("Петров :" + phoneBook.get("Петров"));
        System.out.println("Козлов :" + phoneBook.get("Козлов"));
        System.out.println("Бобров :" + phoneBook.get("Бобров"));
    }
}
