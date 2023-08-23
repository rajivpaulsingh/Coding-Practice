package Codility;

import java.util.Stack;

// https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
public class StoneWall {
    
    public static void main(String[] args) {

        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};

        System.out.println("Number of blocks? " + blocks(H));
    }

    private static int blocks(int[] H) {
        
        // main idea: need to use "stack" to check when we need a new block
    
        Stack<Integer> st = new Stack<>();
        int numBlock =0;
    
        // note: H[i] is the ith height of the wall
        for(int i = 0; i < H.length; i++){
        
            // step 1: "stack is not empty" AND "from high to low"
            // then, "pop" (it is the key point, be careful)
            while( st.isEmpty() == false && st.peek() > H[i] ){
                st.pop();
            }
            // step 2: if the stack is empty
            if( st.isEmpty() ){
                numBlock++;     // add a block
                st.push(H[i]);  // push the height
            }
            // step 3: the height is the same: do nothing
            else if( st.peek() == H[i] ){
            } 
            // step 4: from low to high 
            else if( st.peek() < H[i] ){
                numBlock++;    // add a block
                st.push(H[i]); // push the height
            }
        }
        
        return numBlock;
    }
}