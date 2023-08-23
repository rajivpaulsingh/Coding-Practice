package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class ThreeFactors {

    public static void main(String[] args) {

        int[] numbers = {4, 7, 9, 11, 13, 15};
        
        System.out.println("Numbers with exactly three factors: " + findNumbersWithThreeFactors(numbers));

    }

    public static List<Integer> findNumbersWithThreeFactors(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (hasExactlyThreeFactors(num)) {
                result.add(num);
            }
        }
        return result;
    }
    
    public static boolean hasExactlyThreeFactors(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return count == 3;
    }
}
