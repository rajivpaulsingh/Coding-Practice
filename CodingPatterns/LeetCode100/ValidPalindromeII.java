package LeetCode100;

public class ValidPalindromeII {

    public static void main(String[] args) {
        
        // You can deleted upto 1 character
        String str1 = "aba";
        String str2 = "abca";

        System.out.println("Is palindrome? " + isPalin(str1));
        System.out.println("Is palindrome? " + isPalin(str2));
    }
    
    private static boolean isPalin(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return validPalin(str.substring(left + 1, right)) || validPalin(str.substring(left, right - 1));
            }
        }
        return true;
    }

    private static boolean validPalin(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
