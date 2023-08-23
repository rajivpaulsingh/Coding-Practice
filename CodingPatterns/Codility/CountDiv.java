package Codility;

// https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/

public class CountDiv {

    public static void main(String[] args) {

        int A = 6;
        int B = 11;
        int K = 2;

        System.out.println("Number of divisors are: " + countDiv(A, B, K));
    }
    
    private static int countDiv(int A, int B, int K) {

        if (K > B) return 0;

        int bCounts = (int) Math.floor(B / K);
        int aCounts = (int) Math.floor(A / K);

        // no of divisible numbers
        int num = bCounts - aCounts;

        // if(A % K == 0)
        int plus = 0;
        if(A % K == 0) {
            plus = 1;
        } 
        num += plus;

        return num;
    }
}
