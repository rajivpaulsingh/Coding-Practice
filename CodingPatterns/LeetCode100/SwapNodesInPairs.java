package LeetCode100;


public class SwapNodesInPairs {

    class ListNode {

        int val;
        ListNode next;
    
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }
    }
    
    public ListNode swapPairs(ListNode head) {

        if(head == null) return null;
        ListNode cur = head;

        while(cur != null && cur.next != null) {
            int temp = cur.val;
            cur.val = cur.next.val;
            cur.next.val = temp;

            cur = cur.next.next;
        }
        return head;
    }
}
