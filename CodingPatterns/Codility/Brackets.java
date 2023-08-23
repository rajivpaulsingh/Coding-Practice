package Codility;

import java.util.Stack;

// https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
public class Brackets {

    public static void main(String[] args) {
        
        String str1 = "{[()()]}";
        String str2 = "([)()]";

        System.out.println("Are the balances? " + balance(str1));
        System.out.println("Are the balances? " + balance(str2));
    }
    
    private static boolean balance(String str) {

        int n = str.length();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return true;
    }
}
