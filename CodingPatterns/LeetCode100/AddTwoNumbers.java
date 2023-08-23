package LeetCode100;

public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        
        // List: 2 -> 4 -> 3, representing number: 342
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // List: 5 -> 6 -> 4, representing number: 465
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode sum = addTwoNums(l1, l2);

        // Print the sum
        while(sum != null) {
            System.out.print(sum.val + " " );
            sum = sum.next;
        }
    }

    private static ListNode addTwoNums(ListNode l1, ListNode l2) {

        ListNode output = new ListNode(0);
        ListNode dummy = output;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {

            if(l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }

            dummy.next = new ListNode(carry % 10);
            carry = carry / 10;
            dummy = dummy.next;
        }
        
        return output.next;
    }
    
}
