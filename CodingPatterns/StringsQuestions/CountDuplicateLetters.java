package StringsQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicateLetters {
    
    public static void main(String[] args) {
        
        String str = "AABBACBBBCCCDDDDEEEEF";

        countDuplicate(str);
        countDuplicate1(str);
    }

    private static void countDuplicate(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return;
        }

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        int count = 1;
        for(int i = 1; i < n; i++) {

            if(ch[i] == ch[i - 1]) {
                count++;
            } else {
                if(count > 1) {
                    System.out.println("The letter " + ch[i - 1] + " occurred " + count + " times");
                }
                count = 1;
            }
        }
        if(count > 0) {
            System.out.println("The letter " + ch[n - 1] + " occurred " + count + " times");
        }
    }

    public static void countDuplicate1(String str) {

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Remove spaces from the string
        str = str.replaceAll(" ", "");

        // Create a HashMap to store letter counts
        Map<Character, Integer> letterCounts = new HashMap<>();

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Increment the count for the letter in the HashMap
            letterCounts.put(ch, letterCounts.getOrDefault(ch, 0) + 1);
        }

        // Sort the string in alphabetical order
        char[] sortedChars = str.toCharArray();
        Arrays.sort(sortedChars);
        String sortedString = new String(sortedChars);

        // Print the sorted string and count of duplicate letters
        System.out.println("Sorted String: " + sortedString);
        System.out.println("Duplicate Letter Counts:");

        for (char ch : letterCounts.keySet()) {
            int count = letterCounts.get(ch);
            if (count > 1) {
                System.out.println(ch + ": " + count);
            }
        }
    }

}
