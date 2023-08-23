package LeetCode100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println("Most common word: " + mostCommonWord(paragraph, banned));
    }
    
    private static String mostCommonWord(String str, String[] banned) {

        Set<String> set = new HashSet<>();
        for(String s : banned) {
            set.add(s);
        }

        Map<String, Integer> map = new HashMap<>();
        for(String word : str.toLowerCase().replaceAll("[^a-zA-Z]", " ").split(" ")) {

            if(!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int maxCount = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxCount) {
                result = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return result;
    }
}
