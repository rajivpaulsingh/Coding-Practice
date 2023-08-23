package ArraysQuestions;

import java.util.Arrays;

public class RotateArray {
    
    public static void main(String[] args) {

        int[] arr = {3, 8, 9, 7, 6};
        int[] arr1 = {3, 8, 9, 7, 6};
        int k = 3;

        System.out.println("Before rotation: " + Arrays.toString(arr));
        System.out.println("After rotation: " + Arrays.toString(rotate(arr, k)));
        System.out.println("After rotation: " + Arrays.toString(solution(arr1, k)));
    }

    private static int[] rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);

        return arr;
    }

    private static void reverseArray(int[] arr, int left, int right) {

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int[] solution(int[] A, int K) {
		int [] rotatedA = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			//rotated index needs to "wrap" around end of array
			int rotatedIndex = (i + K) % A.length;

			rotatedA[rotatedIndex] = A[i];
		}
        return rotatedA;
    }
}
