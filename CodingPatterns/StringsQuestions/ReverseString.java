package StringsQuestions;

public class ReverseString {
    
    public static void main(String[] args) {

        String str = "Destiny";

        System.out.println("The reversed string is: " + reverse(str));
        System.out.println("The reversed string is: " + reverse1(str));
        System.out.println("The reversed string is: " + reverse2(str));
    }

    private static String reverse(String str) {
        
        int n = str.length();
        if(n == 0 || str == null) {
            return null;
        }

        String res = "";
        for(int i = n-1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }

    private static String reverse1(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return null;
        }

        char[] ch = str.toCharArray();
        char temp;

        for(int i = 0, j = n-1; i < j; i++, j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return String.valueOf(ch);
    }

    private static String reverse2(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return null;
        }

        char[] ch = str.toCharArray();
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        return String.valueOf(ch);

    }
}
