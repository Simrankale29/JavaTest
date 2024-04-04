import java.util.HashMap;
import java.util.Map;

public class NumberOfWords{
    public static void main(String[] args) {
        String str = "Welcome to Java Programming";
        countWords(str);
    }

    public static void countWords(String str) {
        Map<String, Integer> wordMap = new HashMap<>();
        String[] words = str.split("[\\s\\p{Punct}]+");

        int totalCount = 0; 
        for (String word : words) {
            word = word.toLowerCase();
            if (wordMap.containsKey(word)) { 
                wordMap.put(word, wordMap.get(word) + 1);
            } else {   
                wordMap.put(word, 1);
            }
            totalCount++;
        }
        System.out.println("Total word count in the string: " + totalCount);
    }
}