package Codility;

// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class OddOccurances {

    public static void main(String[] args) {

        int[] arr = {9, 3, 9, 3, 9, 7, 9};

        System.out.println("The odd occuring element is: " + oddOccurance(arr));
    }

    private static int oddOccurance(int[] arr) {

        int res = 0;

        for(int i = 0; i < arr.length; i++) {
            res = res ^ arr[i]; // Using XOR
        }

        return res;
    }
    
}
