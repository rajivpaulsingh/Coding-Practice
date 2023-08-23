package LeetCode100;

public class LinkedListMiddleElement {

    class ListNode {
        int val;
        ListNode next;
    
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    public static ListNode middleElement(ListNode head) {

        if(head == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
