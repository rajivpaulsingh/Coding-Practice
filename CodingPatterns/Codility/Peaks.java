package Codility;

import java.util.ArrayList;
import java.util.List;

// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/flags/
public class Peaks {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        System.out.println("The maximum number of same-sized blockes are: " + blocks(arr));
    }

    private static int blocks(int[] A) {

        int N = A.length;
        
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < N - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1])
                peaks.add(i);
        }
        
        for (int elements = 1; elements <= N; elements++) {
            if (N % elements != 0)
                continue;
            
            int findCnt = 0;
            int blocks = N / elements;
            int startIdx = 0;
            int endIdx = elements;
            
            for (int peak : peaks) {
                if (startIdx < peak && peak < endIdx) {
                    findCnt++;
                    startIdx = endIdx;
                    endIdx += elements;
                }
            }
            
            if (findCnt == blocks)
                return blocks;
        }
        
        return 0;
    }
}
