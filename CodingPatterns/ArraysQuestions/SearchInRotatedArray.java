package ArraysQuestions;

public class SearchInRotatedArray {
    
    public static void main(String[] args) {
        
        int arr[] = {4, 5, 6, 7, 0, 2};
        int target = 7;
		
		System.out.println("The searched number is at index: " + search(arr, target));
    }

    private static int search(int[] arr, int target) {

        int n = arr.length;
        if(n == 0 || arr == null) {
            return -1;
        }

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < arr[right]) { // right half sorted
                if(target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            } else { // left half sorted
                if(target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
