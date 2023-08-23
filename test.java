import java.util.*;

public class test {

    public static void main(String[] args) {

        String str1 = "ab#c";
        String str2 = "ad#c";

        System.out.println("Are they equal after backspace removal? " + backspaceCompare(str1, str2));
        
    }

    private static boolean backspaceCompare(String str1, String str2) {
        
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c : str1.toCharArray()) {
            if(c == '#') {
                if(!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for(char c : str2.toCharArray()) {
            if(c == '#') {
                if(!stack2.isEmpty()) {
                    stack2.pop();
                } 
            } else {
                stack2.push(c);
            }
        }

        while(!stack1.isEmpty()) {
            if(!stack1.pop().equals(stack2.pop())) {
                return false;
            }
        }
        
        return true;
    }

}
