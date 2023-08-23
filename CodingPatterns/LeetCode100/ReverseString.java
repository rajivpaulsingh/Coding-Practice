package LeetCode100;

public class ReverseString {
    
    public static void main(String[] args) {

        String str = "Hwllo world";

        System.out.println("The reversed string is: " + reverse(str));
    }

    private static String reverse(String str) {
        if(str.length() < 0) {
            return null;
        }

        int left = 0;
        int right = str.length() - 1;
        char[] ch = str.toCharArray();

        while(left <= right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(ch);
    }
}
