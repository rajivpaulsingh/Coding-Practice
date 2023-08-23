package Codility;

// https://app.codility.com/programmers/lessons/16-greedy_algorithms/tie_ropes/
public class TieRopes {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 1, 1, 3};
        int K = 4;

        System.out.println("The number of ropes are: " + tieRopes(arr, K));
    }

    private static int tieRopes(int[] arr, int K) {

        int n = arr.length;

        int count = 0;
        int cur = 0;

        for(int i = 0; i < n; i++) {
            cur = cur + arr[i];

            if(cur >= K) {
                count++;
                cur = 0;
            }
        }

        return count;
    }
}
