package Misc;

import java.util.*;


public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "Is it your first company";
	    System.out.println("First non repeating character is: " + occur(str));
	}

    private static char occur(String str) {

        int n = str.length();
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        for(char c : str.toCharArray()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("No value");
    }

}