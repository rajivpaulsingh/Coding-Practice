package Codility;

import java.util.Stack;

// https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
public class Fish {

    public static void main(String[] args) {

        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};

        System.out.println("Alive fishes are: " + aliveFishes(A, B));
    }
    
    private static int aliveFishes(int[] A, int[] B) {

        // main idea: use "stack" to store the fishes with B[i]==1, that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        Stack<Integer> stack = new Stack<>();
        int res = A.length;

        for(int i = 0; i < A.length; i++) {

            // case 1; for the fish going to downstrem, push the fish to "stack", so we can keep them from the "last" one
            if(B[i] == 1) {
                stack.push(A[i]);
            }

            // case 2: for the fish going upstream, check if there is any fish going to downstream
            if(B[i] == 0) {
                while( !stack.isEmpty() ){ 
                    // if the downstream fish is bigger (eat the upstream fish)
                    if( stack.peek() > A[i] ){
                        res--;
                        break;      // the upstream fish is eaten (ending)   
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if(stack.peek() < A[i]){
                        res--;
                        stack.pop();   // the downstream fish is eaten (not ending)
                    }
                }
            }
        }
        return res;
    }
}
