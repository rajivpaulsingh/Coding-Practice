package Fanatics;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        
        int num = 28;

        System.out.println("Is this a happy number? " + happy(num));
        System.out.println("Is this a happy number? " + isHappyNumber(num));
    }
    
    private static boolean happy(int n) {

        Set<Integer> set = new HashSet<>();

        while(n != 1) {

            int current = n;
            int sum = 0;

            while(current != 0) {

                sum += (current % 10) * (current % 10);
                current = current / 10;
            }

            if(set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
        }
        
        return true;
    }

    public static boolean isHappyNumber(int number) {
        if (number == 1 || number == 7) {
            return true; // Base cases: 1 and 7 are happy numbers
        } else if (number < 10) {
            return false; // Base case: single-digit numbers other than 1 are not happy
        }

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return isHappyNumber(sum); // Recursively check the sum of squares
    }
}
