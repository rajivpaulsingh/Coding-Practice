package Misc;

public class FindNthElementFromEnd {

    public class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        // Node head = new Node(4, null);
        
        // System.out.println("Nth element from end is: " + nthElement(head, 0));
    }

    // private static Node nthElement(Node head, int n) {

    //     int len = 0;
    //     while(head != null) {
    //         head = head.next;
    //         len++;
    //     }

    //     for(int i = 0; i < len - n - 1; i++) {
    //         head = head.next;
    //     }

    //     return head;
    // }
    
}
