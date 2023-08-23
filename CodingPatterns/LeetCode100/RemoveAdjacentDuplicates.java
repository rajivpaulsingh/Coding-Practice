package LeetCode100;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    
    public static void main(String[] args) {
        
        String str = "abbaca";

        System.out.println("String after adjacent duplicate removals: " + removeDups(str));
    }

    private static String removeDups(String str) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
