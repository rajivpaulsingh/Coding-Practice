package LeetCode100;

public class PalindromeNumber {
    
    public static void main(String[] args) {

        int n1 = 121;
        int n2 = 234;

        System.out.println("Is this a palindrome number? " + palin(n1));
        System.out.println("Is this a palindrome number? " + palin(n2));
    }

    private static boolean palin(int num) {
        
        int rev = 0;
        int x = num;

        while(num != 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }

        return rev == x;
    }
}
