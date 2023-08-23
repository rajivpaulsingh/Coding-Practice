package StringsQuestions;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a test sentence. This sentence is for counting word occurrences.";
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Create a HashMap to store word occurrences
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If the word is already present in the map, increment its count by 1
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with a count of 1
                wordCountMap.put(word, 1);
            }
        }
        
        // Print the word occurrences
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
