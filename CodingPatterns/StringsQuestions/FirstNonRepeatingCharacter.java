package StringsQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    
    public static void main(String[] args) {

        String str = "Is it your first company";

	    System.out.println("First non repeating character is: " + occur(str));
    }

    private static char occur(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return 0;
        }

        str = str.toLowerCase();

        Map<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if(!hmap.containsKey(c)) {
                hmap.put(c, 1);
            } else {
                hmap.put(c, hmap.get(c) + 1);
            }
        }

        for(char c : str.toCharArray()) {
            if(hmap.get(c) == 1) {
                return c;
            }
        }

        return 0;
        
    }
}
