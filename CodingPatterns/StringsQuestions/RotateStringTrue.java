package StringsQuestions;

public class RotateStringTrue {

    public static void main(String[] args) {
        
        String A = "abcde";
        String B = "cdeab";

        System.out.println("Are the strings rotated? " + rotateString(A, B));
    }

    private static boolean rotateString(String A, String B) {

        if(A.length() != B.length()) return false;

        return (A + A).contains(B);
    }
    
}
