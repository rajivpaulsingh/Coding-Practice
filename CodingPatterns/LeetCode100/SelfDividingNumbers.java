package LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    
    public static void main(String[] args) {
        
        // 128 num is divisble by 1, 2, and 8
        int left = 1;
        int right = 22;

        System.out.println("Self divisible numbers are: " + selfDivisionNumbers(left, right));
    }

    private static List<Integer> selfDivisionNumbers(int left, int right) {
        
        List<Integer> res = new ArrayList<>();

        for(int i = left; i <= right; i++) {
            if(isSelfDivisible(i)) {
                res.add(i);
            }
        }

        return res;
    }

    private static boolean isSelfDivisible(int num) {

        int original = num;

        while(num > 0) {
            int digit = num % 10;
            if(digit == 0 || original % digit != 0) {
                return false;
            }

            num = num / 10;
        }
        return true;
    }
}
