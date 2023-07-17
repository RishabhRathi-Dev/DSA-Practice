/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode reverse(ListNode head, ListNode prev){
        if (head.next == null){
            head.next = prev;
            return head;
        }
        
        ListNode temp = head.next;
        head.next = prev;
        return reverse(temp, head);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nl1 = reverse(l1, null);
        ListNode nl2 = reverse(l2, null);

        ListNode ans = new ListNode();
        ListNode hold = ans;
        int carry = 0;
        int nl1v = 0;
        int nl2v = 0;
        while(nl1 != null || nl2 != null){
            if (nl1 == null){
                nl1v = 0;
            } else {
                nl1v = nl1.val;
            }

            if (nl2 == null){
                nl2v = 0;
            } else {
                nl2v = nl2.val;
            }

            int s = nl1v + nl2v + carry;
            int u = s%10;
            carry = (int)(s/10);

            ans.val = u;
   
            if (nl1 != null){
                nl1 = nl1.next;
            }

            if (nl2 != null){
                nl2 = nl2.next;
            }

            if (nl1 != null || nl2 != null){
                ListNode temp = new ListNode();
                ans.next = temp;
                ans = ans.next;
            }
        }

        if (carry > 0){
            ans.next = new ListNode(carry);
        }

        return reverse(hold, null);
    }
}