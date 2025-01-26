package lesson8;

import java.util.*;

public class WordProcessor {
    private String[] words;

    public WordProcessor(String[] words) {
        this.words = words;
    }

    public Set<String> getUniqueWords() {
        Set<String> uniqueWords = new HashSet<>();
        Set<String> allWords = new HashSet<>();

        for (String word : words) {
            if (!allWords.add(word)) {
                uniqueWords.remove(word);
            } else {
                uniqueWords.add(word);
            }
        }
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
