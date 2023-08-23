package Codility;

import java.util.Arrays;

// https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
public class NumberOfDiscIntersections {

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 2, 1, 4, 0};

        System.out.println("Number of intersections are: " + intersect(arr));
    }
    
    private static int intersect(int[] A) {
        // main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point "is bigger than or equal to" one lower point)
        
        // note: use "long" for big numbers (be careful)
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];
        
        for(int i = 0; i < A.length; i++){
            lower[i] = i - (long)A[i]; // note: lower = center - A[i]
            upper[i] = i + (long)A[i]; // note: upper = center + A[i]
        }
        
        int intersection = 0; // number of intersections
        
        // scan the upper points
        for(int i = 0; i < A.length; i++){
            // note: compare "i" with "j": need to set "j=i+1" (avoid double counting)
            for(int j = i + 1; j < A.length; j++){
                // intersection: when one's upper is bigger than "or equal to" one's lower (important)
                if(upper[i]>=lower[j]){ // note: when "equal to", there is also an intersection
                    intersection++;
                }
            }
        }
        
        // for the overflow cases
        if(intersection > 10_000_000)
            return -1;
        
        return intersection; // number of intersections      
    }

    public int solution(int[] A) {
        
        // main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point > one lower point)
        
        // note: use "long" for big numbers (be careful)
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];
        
        for(int i=0; i<A.length; i++){
            lower[i] = i - (long)A[i]; // note: lower = center - A[i]
            upper[i] = i + (long)A[i]; // note: upper = center + A[i]
        }
        
        // "sort" the "lower points" and "upper points"
        Arrays.sort(upper);
        Arrays.sort(lower);
        
        int intersection = 0; // number of intersections
        int j=0; // for the lower points
        
        // scan the upper points
        for(int i=0; i<A.length; i++){
        
            // for the curent "j" (lower point)
            while( j < A.length && upper[i] >= lower[j]){
                    intersection = intersection + j; // add j intersections
                    intersection = intersection - i; // minus "i" (avoid double count) 
                    j++;
            }          
        }
        
        // for the overflow cases
        if(intersection > 10_000_000)
            return -1;
        
        return intersection; // number of intersections      
    }
}
