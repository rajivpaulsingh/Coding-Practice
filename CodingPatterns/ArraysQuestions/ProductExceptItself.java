package ArraysQuestions;

import java.util.Arrays;

public class ProductExceptItself {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println("Product of array except itself: " + Arrays.toString(mutltiply(arr)));
        System.out.println("Product of array except itself: " + Arrays.toString(mutltiply1(arr)));
        
    }

    private static int[] mutltiply(int[] arr) {

        int n = arr.length;
        if(n == 0 || arr == null) {
            return null;
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            
            int temp = 1;
            for(int j = 0; j < n; j++) {

                if(i != j) {
                    temp = temp * arr[j];
                }
            }
            res[i] = temp;
        }
        return res;
    }

    private static int[] mutltiply1(int[] arr) {
        int n = arr.length;
        if(n == 0 || arr == null) {
            return null;
        }

        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for(int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }

}
