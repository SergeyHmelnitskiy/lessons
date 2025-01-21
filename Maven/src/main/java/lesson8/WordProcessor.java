package lesson8;

import java.util.*;

public class WordProcessor {
    private Set<String> uniqueWords;
    private String[] words;

    public WordProcessor(String[] words) {
        uniqueWords = new HashSet<>(Arrays.asList(words));
        this.words = words;
    }

    public Set<String> getUniqueWords() {
        return uniqueWords;
    }

    public Map<String, Integer> getCountWordOccurrences() {
        Map<String, Integer> wordOccurrences = new HashMap<>();

        for (String word : words) {
               wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
            }
        return wordOccurrences;
        }
    }
