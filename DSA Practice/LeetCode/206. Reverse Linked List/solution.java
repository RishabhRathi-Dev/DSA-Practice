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
    public ListNode rec(ListNode head, ListNode pre){
        if (head == null){
            return pre;
        }

        ListNode next = head.next;
        head.next = pre;

        return rec(next, head);
        
    }

    public ListNode reverseList(ListNode head) {
        return rec(head, null);
    }
}