package StringsQuestions;

public class LongestPalindrome {
    

    public static String findLongestPalindromicSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        int n = s.length();
        int maxLength = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];
    
        // Single characters are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
    
        // Check for palindromes of length 2 or more
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (length == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] && length > maxLength) {
                        maxLength = length;
                        start = i;
                    }
                }
            }
        }
    
        return s.substring(start, start + maxLength);
    }
    
}
