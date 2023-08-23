package Codility;

// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/
public class CountFactors {
    
    public static void main(String[] args) {
        
        int N = 24;

        System.out.println("The number of factors are: " + factors(N));
    }

    private static int factors(int N) {

        int count = 0;
        
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                count++;
            }
        }

        return count;
    }
}
