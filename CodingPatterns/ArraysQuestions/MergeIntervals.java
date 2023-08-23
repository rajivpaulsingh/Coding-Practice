package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    
    public static void main(String[] args) {
        
        int arr[][] = {};
		
		System.out.println("Merged Intervals are: " + merge(arr));
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }
    
        // Sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);
    
        for(int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
    
            if(currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
    
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
