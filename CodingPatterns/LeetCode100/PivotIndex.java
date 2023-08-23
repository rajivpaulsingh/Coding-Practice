package LeetCode100;

public class PivotIndex {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println("The pivot index is: " + findPivot(arr));
    }

    private static int findPivot(int[] arr) {

        int totalSum = 0;
        for(int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for(int i = 0; i < arr.length; i++) {

            if(leftSum == totalSum - arr[i] - leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
