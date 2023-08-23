package StringsQuestions;

public class ReverseStringRecursive {

    public static void main(String[] args) {

        String str = "Destiny";

        System.out.println("The reversed string is: " + reverseRecursive(str));
    }

    private static String reverseRecursive(String str) {

        int n = str.length();

        if(n <= 1) {
            return str;
        }

        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }
    
}
