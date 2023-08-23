package ArraysQuestions;

public class NonDecreasingArray {
    
    public static void main(String[] args) {

        int[] arr = {4, 2, 3};

        System.out.println("Is the array non-decreasing? " + checkNonDecreasing(arr));
    }

    private static boolean checkNonDecreasing(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;

        // int count = 0;

        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         count++;
        //         if (count > 1) {
        //             return false;
        //         }

        //         // Fix the non-decreasing condition
        //         if (i > 0 && arr[i - 1] > arr[i + 1]) {
        //             arr[i + 1] = arr[i];
        //         } else {
        //             arr[i] = arr[i + 1];
        //         }
        //     }
        // }

        // return true;
    }
}
