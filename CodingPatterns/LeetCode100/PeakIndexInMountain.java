package LeetCode100;

public class PeakIndexInMountain {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 5, 7, 9, 3, 1, 0};

        System.out.println("The peak index is: " + peakIndex(arr));
        System.out.println("The peak index is: " + peakIndex1(arr));
    }

    private static int peakIndex(int[] arr) {

        int n = arr.length;

        if(n == 0 || arr == null) return -1;

        int maxIndex = 0;

        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int peakIndex1(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int mid = left + (right - left)/2;
            
            if(arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
