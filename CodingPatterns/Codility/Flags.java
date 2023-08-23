package Codility;

// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/flags/
public class Flags {

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        System.out.println("The maximum number of flags are: " + maxFlags(arr));
    }
    
    private static int maxFlags(int[] arr) {

        int n = arr.length;
        int count = 0;

        for(int i = 1; i < n - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    class Solution {
        public int solution(int[] A) {
            int N = A.length;
            
            // Find peaks
            boolean[] peaks = new boolean[N];
            for (int i = 1; i < N - 1; i++) {
                if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                    peaks[i] = true;
                }
            }
            
            int maxFlags = 0;
            int start = 1;
            int end = (int) Math.sqrt(N) + 1;
            
            // Find maximum number of flags
            while (start <= end) {
                int flags = 0;
                int position = -1;
                
                for (int i = 0; i < N; i++) {
                    if (peaks[i]) {
                        if (position < 0 || i - position >= start) {
                            flags++;
                            position = i;
                        }
                    }
                    
                    if (flags == start) {
                        break;
                    }
                }
                
                maxFlags = Math.max(maxFlags, flags);
                start++;
            }
            
            return maxFlags;
        }
    }
    
}
