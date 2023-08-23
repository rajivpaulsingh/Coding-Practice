package LeetCode100;
import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int closestSum = threeSumClosest(nums, target);
        System.out.println("Closest Sum: " + closestSum);
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closestSum to the sum of the first three numbers

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer to the element next to the current element
            int right = nums.length - 1; // Pointer to the last element

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the sum of the three elements

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update closestSum if the current sum is closer to the target
                }

                if (sum < target) {
                    left++; // Increment left pointer if the sum is smaller than the target
                } else if (sum > target) {
                    right--; // Decrement right pointer if the sum is greater than the target
                } else {
                    return target; // Return early if the sum is equal to the target
                }
            }
        }

        return closestSum;
    }
}

