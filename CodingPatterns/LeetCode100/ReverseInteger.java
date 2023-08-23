package LeetCode100;

public class ReverseInteger {
    
    public static void main(String[] args) {

        int n = 234;

        System.out.println("Reversed Integer is: " + rev(n));
    }

    private static int rev(int num) {
        
        int rev = 0;

        while(num != 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }

        return rev;
    }
}
