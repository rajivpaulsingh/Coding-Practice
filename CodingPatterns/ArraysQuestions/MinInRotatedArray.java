package ArraysQuestions;

public class MinInRotatedArray {

    public static void main(String[] args) {
        
        int arr[] = {4, 5, 6, 7, 0, 2};
		
		System.out.println("The min number is: " + findMin(arr));
    }

    private static int findMin(int[] arr) {

        int n = arr.length;
        if(n == 0 || arr == null) {
            return -1;
        }

        int left = 0;
        int right = n - 1;

        while(left < right) {
            int mid = left + (right - left)/2;

            if(arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
    
}
