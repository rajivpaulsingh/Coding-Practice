package LeetCode100;

import java.util.Stack;

public class MinAddToMakeValidParenthesis {

    public static void main(String[] args) {
        
        String str = "()))((";

        System.out.println("Min add to make it valid: " + makeValid(str));
        System.out.println("Min add to make it valid: " + makeValid1(str));
    }

    private static int makeValid(String str) {

        int left = 0;
        int right = 0;

        for(char c : str.toCharArray()) {
            if(c == '(') {
                left++;
            } else {
                if(left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }
        return left + right;
    }

    private static int makeValid1(String str) {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }
        }
        return stack.size();
    }
    
}
