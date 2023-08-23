package Fanatics;



public class DeleteANode {

    public static class ListNode {
        int val;
        ListNode next;

    public ListNode(int val) {
        this.val = val;
        }
    }
    
    public static ListNode deleteNode(ListNode head, int target) {
        // Case 1: If the head node itself contains the target value
        if (head != null && head.val == target) {
            return head.next;
        }

        ListNode prev = null;
        ListNode current = head;

        // Traverse the linked list to find the target node
        while (current != null && current.val != target) {
            prev = current;
            current = current.next;
        }

        // Case 2: If the target node is found, delete it
        if (current != null) {
            prev.next = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int target = 3;

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Delete the node with the target value
        head = deleteNode(head, target);

        System.out.println("Linked List after deleting node with value " + target + ":");
        printLinkedList(head);
    }
}
