package LeetCode100;

public class SingleNumber {
    
    public static void main(String[] args) {
        
        int[] arr1 = {2, 2, 1};
        int[] arr2 = {4, 1, 2, 3, 3, 2, 1};

        System.out.println("Single number is: " + singleNum(arr1));
        System.out.println("Single number is: " + singleNum(arr2));
    }

    private static int singleNum(int[] arr) {

        int res = 0;

        for(int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }

        return res;
    }
}
