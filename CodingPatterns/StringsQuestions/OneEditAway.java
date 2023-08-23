package StringsQuestions;

public class OneEditAway {
    
    public static boolean isOneEditAway(String s1, String s2) {
        if (s1.equals(s2)) {
            return true; // strings are identical, no edit needed
        }
        
        int len1 = s1.length();
        int len2 = s2.length();
        int diff = Math.abs(len1 - len2);
        if (diff > 1) {
            return false; // more than one edit needed
        }
        
        int edits = 0;
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            if (s1.charAt(i) != s2.charAt(j)) {
                edits++;
                if (edits > 1) {
                    return false; // more than one edit needed
                }
                if (len1 > len2) {
                    i++;
                } else if (len2 > len1) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
        
        if (i < len1 || j < len2) {
            edits++;
        }
        
        return edits == 1;
    }
    
}
