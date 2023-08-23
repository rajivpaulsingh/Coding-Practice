package Codility;

// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/
public class MinPerimeterRectange {

    public static void main(String[] args) {

        int N = 30;

        System.out.println("The minimal perimeter is: " + minPerimeter(N));
    }
    
    private static int minPerimeter(int N) {

        int minPerimeter = Integer.MAX_VALUE;
        
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                int factor = N / i;
                int perimeter = 2 * (i + factor);
                minPerimeter = Math.min(minPerimeter, perimeter);
            }
        }
        
        return minPerimeter;
    }
}
