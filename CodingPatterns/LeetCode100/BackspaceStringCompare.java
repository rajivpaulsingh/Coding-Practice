package LeetCode100;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        
        String str1 = "ab#c";
        String str2 = "ad#c";

        System.out.println("Are they equal after backspace removal? " + backspaceCompare(str1, str2));
    }

    private static boolean backspaceCompare(String str1, String str2) {

        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();

        for(char c : str1.toCharArray()) {
            if(c == '#') {
                if(!first.isEmpty()) {
                    first.pop();
                }
            } else {
                first.push(c);
            }
        }

        for(char c : str2.toCharArray()) {
            if(c == '#') {
                if(!second.isEmpty()) {
                    second.pop();
                }
            } else {
                second.push(c);
            }
        }

        //Compare if stacks are equal
        while(!first.isEmpty()) {
            if(!first.pop().equals(second.pop())) {
                return false;
            }
        }
        return true;
    }
    
}
