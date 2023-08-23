package Codility;

// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJump {

    public static void main(String[] args) {

        int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println("The min jumps required are: " + frogJump(X, Y, D));
    }

    private static int frogJump(int x, int y, int d) {

        int res = 0;
        int total = x;

        while(total < y) {
            res++;
            total += d;
        } 
        return res;
    }

    public int solution(int X, int Y, int D) {
        int distance = Y - X; // Calculate the total distance to be covered
        int jumps = distance / D; // Calculate the number of complete jumps
        
        // If there is a remainder, an extra jump is needed
        if (distance % D != 0) {
            jumps++;
        }
        
        return jumps;
    }
    
}
