package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_semiprimes/
public class CountSemiprimes {
    
    public static void main(String[] args) {

        int N = 26;
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};

        System.out.println("The count of semi-primes are: " + Arrays.toString(countSemiprimes(N, P, Q)));
    }

    private static int[] countSemiprimes(int N, int[] P, int[] Q) {

        // main idea:
        // using "sieve of Eratosthenes"
        // https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        
        boolean[] primeArray = new boolean[N+1]; // note: plus one for "0"
        
        // initial settting (sieve of Eratosthenes)
        Arrays.fill(primeArray, true); // initial setting: all primes
        primeArray[0] = false;         // not prime 
        primeArray[1] = false;         // not prime
        int sqrtN = (int)Math.sqrt(N);
        // sieve of Eratosthenes
        for(int i =1; i < sqrtN; i++){   
            if(primeArray[i] == true) // prime
            {
                for(int j=i*i; j<=N; j=j+i){
                    primeArray[j] = false; // not prime
                }
            }   
        }
        
        // store all primes in "List"
        List<Integer> primeList = new ArrayList<>();
        for(int i=2; i<= N; i++){
            if(primeArray[i] == true){
                primeList.add(i);    // "i" is prime
            }
        }
        
        // find "semiprimes"
        boolean[] semiprimeArray = new boolean[N+1]; // note: plus one for "0"
        Arrays.fill(semiprimeArray, false); // initial setting: all "not" semiprimes
        long semiprimeTemp; // using "long" (be careful)
        // for "primeList.size()"
        for(int i=0; i< primeList.size(); i++){
            for(int j=i; j< primeList.size(); j++){
                semiprimeTemp = (long) primeList.get(i) * (long) primeList.get(j); // semiprimes
                if(semiprimeTemp > N){
                    break;
                }
                else{
                    semiprimeArray[(int)semiprimeTemp] = true; // semiprimes
                }
            }
        }

        // compute "cumulative Count of semiprimes"
        int[] semiprimeCumulateCount = new int [N+1]; // note: plus one for "0"
        for(int i=1; i<=N; i++){
            semiprimeCumulateCount[i] = semiprimeCumulateCount[i-1]; // cumulative 
            if(semiprimeArray[i] == true){
                semiprimeCumulateCount[i]++; // semiprimes
            }
        }
        
        // compute "results" (for each query)
        int numQuery = Q.length;
        int[] result = new int[numQuery];
        for(int i=0; i< numQuery; i++){
            result[i] = semiprimeCumulateCount[Q[i]] - semiprimeCumulateCount[P[i]-1]; // note: "P[i]-1" (not included)
        }
        return result;
    }
}
