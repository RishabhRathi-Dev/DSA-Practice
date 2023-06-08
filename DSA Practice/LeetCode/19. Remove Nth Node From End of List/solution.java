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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode headHolder = head;
        while(head != null){
            length++;
            head = head.next;
        }

        if (length == 1){
            return head;
        }

        head = headHolder;

        int target = length - n - 1;

        if (target == -1){
            return head.next;
        }

        length = 0; // repurposed to be second pointer
        while(head != null){
            if (length == target){
                try{
                    head.next = head.next.next;
                } catch (Exception e){
                    head.next = null;
                }
            }

            length++;
            head = head.next;
        }

        head = headHolder;
        return head;
    }
}