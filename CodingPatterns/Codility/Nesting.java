package Codility;

import java.util.Stack;

// https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
public class Nesting {
    
    public static void main(String[] args) {

        String str1 = "(()(())())";
        String str2 = "())";

        System.out.println("Are they nested? " + nesting(str1));
        System.out.println("Are they nested? " + nesting(str2));
    }

    private static int nesting(String S) {
        
        // special case 1: empty string
        if( S.length() ==0)
            return 1;
        // special case 2: odd length
        else if( S.length() % 2 == 1)
            return 0;

        // main idea: use "stack" to check
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            
            if( S.charAt(i) == '(' ){
                st.push(')'); // note: push its pair (be careful)
            }
            else if(S.charAt(i)==')'){
                
                // before pop: need to check if stack is empty (important)
                if(st.isEmpty() == true){
                    return 0;
                }
                else{
                    if(st.pop() != ')'){
                        return 0;
                    }   
                }
            }
        }
        
        // be careful: if stack is "not empty" -> return 0
        if( !st.isEmpty() )
            return 0;
        else 
            return 1; 
    }
}
