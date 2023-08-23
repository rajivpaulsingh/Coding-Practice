package StringsQuestions;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    
    public static void main(String[] args) {

        String str1 = "abcdefgha";
        String str2 = "abcdefghojkl";

		System.out.println("Does " + str1 + " have unique characters? " + unique(str1));
        System.out.println("Does " + str2 + " have unique characters? " + unique(str2));
    }

    private static boolean unique(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return false;
        }

        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
