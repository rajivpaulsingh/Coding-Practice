package LeetCode100;

public class ReverseOnlyLetters {
    
    public static void main(String[] args) {
        
        String str = "ab_cd";

        System.out.println("The reversed string is: " + reverse(str));
    }

    private static String reverse(String str) {

        int left = 0;
        int right = str.length() - 1;

        char[] ch = str.toCharArray();
        while(left < right) {
            if(!Character.isLetter(ch[left])) {
                left++;
            }
            if(!Character.isLetter(ch[right])) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}
