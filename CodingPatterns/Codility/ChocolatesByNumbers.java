package Codility;

import java.util.HashSet;
import java.util.Set;

// https://app.codility.com/programmers/lessons/12-euclidean_algorithm/chocolates_by_numbers/
public class ChocolatesByNumbers {
    
    public static void main(String[] args) {

        int N = 10;
        int M = 4;

        System.out.println("The number of chocolates that will be eaten: " + eatChocolate(M, N));
    }

    private static int eatChocolate(int a, int b) {
        
        // GCD problem
        if(a % b == 0) {
            return b;
        }

        return eatChocolate(b, a % b);
    }

    public int solution(int N, int M) {

        Set<Integer> set = new HashSet<>();
        
        int currentNumber = 0;
        set.add(currentNumber); // the 1st chocolate
        int numChocolate = 1;   // eat the 1st one
        
        while(true){
            currentNumber = (currentNumber + M) % N;
            if(set.contains(currentNumber) == true){
                break;
            }
            else{
                numChocolate++; // eat one more chocolate
                set.add(currentNumber); // record its number
            }
        }
        
        return numChocolate;
    }
}
