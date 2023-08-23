package LeetCode100;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        
        String[] words = {"gin", "zen", "gig", "msg"};
        
        System.out.println("Unique morse code words are: " + uniqueMorseCode(words));
    }
    
    private static int uniqueMorseCode(String[] words) {

        String[] table = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();
        
        for(String word : words) {
            StringBuilder sb = new StringBuilder();

            for(char c : word.toCharArray()) {
                sb.append(table[c - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
