package LeetCode100;

public class BinarySearch {
    
    public static void main(String[] args) {

        int[] arr = {-1, 0, 3, 5, 9, 11, 13};
        int target = 9;

        System.out.println("Index of element is: " + binarySearch(arr, target));
        System.out.println("Index of element is: " + binarySearch1(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {

        if(arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length;

        while(left < right) {
            int mid = left + (right - left)/2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    private static int binarySearch1(int arr[], int target) {

        int left = 0;
        int right = arr.length;

        return binarySearchRecursion(arr, left, right, target);
    }

    private static int binarySearchRecursion(int[] arr, int left, int right, int target) {

        int mid = left + (right-left)/2;

        if(arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursion(arr, left, mid - 1, target);
        } else {
            return binarySearchRecursion(arr, mid + 1, right, target);
        }
    }
}
