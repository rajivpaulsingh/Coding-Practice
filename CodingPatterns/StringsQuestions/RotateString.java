package StringsQuestions;

public class RotateString {

    public static void main(String[] args) {

        String original = "hello world";

        System.out.println("Rotated String is: " + rotateString(original, 2)); // prints "llo worldhe"
    }

    private static String rotateString(String str, int k) {

        int n = str.length();
        k = k % n;

        return str.substring(k) + str.substring(0, k);
    }
    
}
