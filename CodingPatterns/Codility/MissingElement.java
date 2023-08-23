package Codility;

// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
public class MissingElement {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 5};

        System.out.println("Missing element is: " + missing(arr));
        System.out.println("Missing element is: " + missing1(arr));
    }

    private static int missing(int[] arr) {

        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    private static int missing1(int[] arr) {

        int A = 0, B = 0;
        int n = arr.length + 1;

        for(int i = 0; i < n - 1; i++) {
            A = A ^ arr[i];
        }
        for(int i = 1; i <= n; i++) {
            B = B ^ i;
        }

        return A ^ B;
    }
    
}
