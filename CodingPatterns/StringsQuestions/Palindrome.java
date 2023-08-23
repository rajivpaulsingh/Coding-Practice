package StringsQuestions;

public class Palindrome {

    public static void main(String[] args) {
        
        String str1 = "racecar";
        String str2 = "gudia";

        System.out.println("Is " + str1 + " a palindrome? " + isPalin(str1));
        System.out.println("Is " + str2 + " a palindrome? " + isPalin(str2));
    }
    
    private static boolean isPalin(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return false;
        }

        int left = 0;
        int right = n - 1;
        
        while(left <= right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
