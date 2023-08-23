package LeetCode100;

import java.util.Stack;

public class ReverseLinkedList {

    public class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = null;
        }

        public Node(int i) {
        }
    }

    public static Node reverseLL(Node head) {

        if(head == null || head.next == null) return head;

        Node prev = reverseLL(head.next);
        head.next.next = head;
        head.next = null;

        return prev;
    }

    public static Node reverse(Node head) {

        Node prev = null;

        while(head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static Node reverseList(Node head) {

        Stack<Node> stack = new Stack<>();

        Node current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Set the new head as the top of the stack
        Node newHead = stack.pop();
        current = newHead;

        // Pop nodes from stack and update the next pointers
        while (!stack.isEmpty()) {
            Node nextNode = stack.pop();
            current.next = nextNode;
            current = nextNode;
        }

        // Set the next pointer of the last node as null
        current.next = null;

        return newHead;
    }
    
}
