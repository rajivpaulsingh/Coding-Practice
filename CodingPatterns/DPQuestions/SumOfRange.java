package DPQuestions;

public class SumOfRange {
    
    public static void main(String[] args) {
        
        int[] arr = {1, -2, 3, 10, -8, 0};

        System.out.println("Sum of range from i to j: " + sumRange(arr, 2, 4));
        System.out.println("Sum of range from i to j: " + sumRange(arr, 1, 4));
    }

    private static int sumRange(int[] arr, int i, int j) {

        int n = arr.length;
        int[] sumUntil = new int[n];
        sumUntil[0] = arr[0];

        // Fill the sum until arr
        for(int k = 1; k < n; k++) {
            sumUntil[k] = sumUntil[k - 1] + arr[k];
        }

        // Real solution
        if(i == 0) {
            return sumUntil[j];
        } else {
            return sumUntil[j] - sumUntil[i - 1];
        }
    }
}
