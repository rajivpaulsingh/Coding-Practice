package LeetCode100;

public class ValidPalindrome {

    public static void main(String[] args) {

        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";

        System.out.println("Its this a valid palindrome? " + isPalin(str1));
        System.out.println("Its this a valid palindrome? " + isPalin(str2));
    }

    private static boolean isPalin(String str) {

        String newStr = "";

        for(char c : str.toCharArray()) {
            if(Character.isLetter(c) || Character.isDigit(c)) {
                newStr += c;
            }
        }
        newStr = newStr.toLowerCase();

        int left = 0;
        int right = newStr.length() - 1;

        while(left <= right) {
            if(newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
