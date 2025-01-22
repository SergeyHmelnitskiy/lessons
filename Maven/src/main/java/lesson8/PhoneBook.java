package lesson8;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        List<String> numbers = phoneBook.get(lastName);

        if(numbers.isEmpty()) {
            return Collections.emptyList();
        }
        return numbers;
    }
}
