package Fanatics;

public class SearchInRotatedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Element existed in this index: " + search(arr, target));
    }

    private static int search(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < arr[right]) { // right half sorted
                if(arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else { // left half sorted
                if(arr[mid] > target && target >= arr[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
