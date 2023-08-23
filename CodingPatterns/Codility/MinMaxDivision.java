package Codility;

// https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/
// Divide array A into K blocks and minimize the largest sum of any block.

/*
 * For example, you are given integers K = 3, M = 5 and array A such that:

  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
The array can be divided, for example, into the following blocks:

[2, 1, 5, 1, 2, 2, 2], [], [] with a large sum of 15;
[2], [1, 5, 1, 2], [2, 2] with a large sum of 9;
[2, 1, 5], [], [1, 2, 2, 2] with a large sum of 8;
[2, 1], [5, 1], [2, 2, 2] with a large sum of 6.
The goal is to minimize the large sum. In the above example, 6 is the minimal large sum.
 */
public class MinMaxDivision {

    public static void main(String[] args) {

        int K = 3;
        int M = 5;
        int[] arr = {2, 1, 5, 1, 2, 2, 2};

        System.out.println("The minimal largest sum is: " + minLargeSum(K, M, arr));
    }

    private static int minLargeSum(int K, int M, int[] A) {
       
        // main idea:
        // The goal is to find the "minimal large sum"
        // We use "binary search" to find it (so, it can be fast)
        
        // We assume that the "min max Sum" will be 
        // between "min" and "max", ecah time we try "mid"
        
        int minSum =0;
        int maxSum =0; 
        for(int i=0; i<A.length; i++){
            maxSum = maxSum + A[i];          // maxSum: sum of all elements
            minSum = Math.max(minSum, A[i]); // minSum: at least one max element
        }
        
        int possibleResult = maxSum; // the max one must be an "ok" result
        
        // do "binary search" (search for better Sum)
        while(minSum <= maxSum){
            // define "mid" (binary search)
            int midSum = (minSum + maxSum) /2;
            
            // check if it can be divided by using 
            // the minMaxSum = "mid", into K blocks ?
            boolean ok = checkDivisable(midSum, K, A);
            
            // if "ok", means that we can try "smaller"
            // otherwise ("not ok"), we have to try "bigger"
            if(ok == true){
                possibleResult = midSum; // mid is "ok"
                // we can try "smaller"
                maxSum = midSum - 1; 
            }
            else{ // "not ok"
            // we have to try "bigger"
                minSum = midSum + 1;
            }
            // go back to "binary search" until "min > max"
        }
        
        return possibleResult;
    }
    
    // check if it can be divided by using the minMaxSum = "mid", into K blocks ?
    public static boolean checkDivisable(int mid, int k, int[] a){
        int numBlockAllowed = k;
        int currentBlockSum = 0;
        
        for(int i=0; i< a.length; i++){
            currentBlockSum = currentBlockSum + a[i];
            
            if(currentBlockSum > mid){ // means: need one more block
                numBlockAllowed--;
                currentBlockSum = a[i]; // note: next block
            }
            
            if(numBlockAllowed == 0){
                return false; // cannot achieve minMaxSum = "mid"
            }
        }
        
        // can achieve minMaxSum = "mid"
        return true;   
    }
    
}
