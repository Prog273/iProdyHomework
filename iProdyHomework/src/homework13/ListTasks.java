package homework13;

import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    public static void main(String[] args) {
        System.out.println(findUnique(List.of(1, 2, 3, 4, 5, 1, 2, 3, 5)));
        calcOccurance(List.of("a", "b", "a", "c", "d", "b", "b"));
        findOccurance(List.of("a", "b", "a", "c", "d", "b", "b"));
    }

    public static int countOccurance(List<String> list, String string) {
        int count = 0;
        for (String str : list) {
            if (str.equals(string)) count++;
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int number : array) {
            list.add(number);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (var number : numbers) {
            if (uniqueNumbers.contains(number)) continue;
            uniqueNumbers.add(number);
        }
        return uniqueNumbers;
    }

    public static void calcOccurance(List<String> words) {
        //создаём и заполняем массив с неповторяющимися словами
        List<String> uniqueWords = new ArrayList<>();
        for (var word : words) {
            if (uniqueWords.contains(word)) continue;
            uniqueWords.add(word);
        }
        //считаем количество слов и вносим в список
        List<String> occurancies = new ArrayList<>();
        for (var uniqueWord : uniqueWords) {
            int count = 0;
            for (var word : words) {
                if (word.equals(uniqueWord)) count++;
            }
            String wordCount = uniqueWord + ": " + count;
            occurancies.add(wordCount);
        }
        System.out.println(occurancies);
    }

    public static void findOccurance(List<String> words) {
        //создаём и заполняем массив с неповторяющимися словами
        List<String> uniqueWords = new ArrayList<>();
        for (var word : words) {
            if (uniqueWords.contains(word)) continue;
            uniqueWords.add(word);
        }
        //считаем количество слов, вносим списки в список и выводим в консоль
        List<List<String>> occurancies = new ArrayList<>();
        for (var uniqueWord : uniqueWords) {
            int count = 0;
            for (var word : words) {
                if (word.equals(uniqueWord)) count++;
            }
            List<String> wordCount = new ArrayList<>();
            wordCount.add("name: \"" + uniqueWord + "\"");
            wordCount.add("occurence: " + count);
            occurancies.add(wordCount);
        }
        System.out.println(occurancies);
    }

}