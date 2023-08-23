package LeetCode100;

public class RemoveKthNodeFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeKthNode(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i < k; i++) {
            if(fast == null) return null;

            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // here is where we remove this node
        slow.next = slow.next.next;

        return dummy.next;
    }
    
}
