package ArraysQuestions;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 456;

        System.out.println("Reversed number is: " + reverse(num));
    }

    private static int reverse(int num) {

        int rev = 0;

        while(num != 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }

        return rev;
    }
    
}
