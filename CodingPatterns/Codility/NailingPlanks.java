package Codility;

// https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks/
public class NailingPlanks {
    
    class Solution {
        public int solution(int[] A, int[] B, int[] C) {
            int n = A.length;
            int m = C.length;
    
            int[] nails = new int[2 * m + 1];
    
            for (int i = 0; i < m; i++) {
                nails[C[i]] = 1;
            }
    
            for (int i = 1; i < nails.length; i++) {
                nails[i] += nails[i - 1];
            }
    
            int result = -1;
    
            for (int i = 0; i < n; i++) {
                int start = A[i];
                int end = B[i];
                int minNails = findMinNails(start, end, nails);
    
                if (minNails == -1) {
                    return -1; // Planks cannot be nailed
                }
    
                result = Math.max(result, minNails);
            }
    
            return result;
        }
    
        private int findMinNails(int start, int end, int[] nails) {
            int minNails = -1;
    
            while (start <= end) {
                int mid = (start + end) / 2;
                int nailsBeforeMid = nails[mid];
                int nailsAfterMid = nails[end];
    
                if (nailsBeforeMid > 0 && nailsBeforeMid == nailsAfterMid) {
                    minNails = nailsBeforeMid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
    
            return minNails;
        }
    }
    
}
