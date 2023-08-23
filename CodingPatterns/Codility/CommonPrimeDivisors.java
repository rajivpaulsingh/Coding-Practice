package Codility;

// https://app.codility.com/programmers/lessons/12-euclidean_algorithm/common_prime_divisors/
public class CommonPrimeDivisors {
    
    public static void main(String[] args) {
        
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};

        System.out.println("The same common divisors are: " + commonDivisors(A, B));
    }

    private static int commonDivisors(int[] A, int[] B) {

        int count = 0;
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (hasSamePrimeDivisors(A[i], B[i])) {
                count++;
            }
        }

        return count;
    }

    private static boolean hasSamePrimeDivisors(int a, int b) {
        int gcd = calculateGCD(a, b);

        while (a != 1) {
            int newGcd = calculateGCD(a, gcd);
            if (newGcd == 1) {
                break;
            }
            a /= newGcd;
        }

        if (a != 1) {
            return false;
        }

        while (b != 1) {
            int newGcd = calculateGCD(b, gcd);
            if (newGcd == 1) {
                break;
            }
            b /= newGcd;
        }

        return b == 1;
    }

    private static int calculateGCD(int a, int b) {
        
        if (a % b == 0) {
            return b;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}
