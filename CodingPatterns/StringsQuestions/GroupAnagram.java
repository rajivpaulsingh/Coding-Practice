package StringsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("abc", "cab", "bac", "def");

        System.out.println("Grouped anagrams are: ");
        System.out.println(groupAnagrams(words));
    }

    private static List<List<String>> groupAnagrams(List<String> words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : words) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }

}
