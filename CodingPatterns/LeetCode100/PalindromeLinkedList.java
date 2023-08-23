package LeetCode100;

public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        if(head == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = reverseLL(slow);

        while( temp != null) {
            if(temp.val != head.val) {
                return false;
            }
        }
        return true;
    }

    private static ListNode reverseLL(ListNode head) {

        ListNode prev = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
}
