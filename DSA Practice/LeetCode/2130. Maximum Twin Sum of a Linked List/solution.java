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
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode ref = head;
        int length = 0;
        while(head != null){
            stack.push(head.val);
            length++;
            head = head.next;
        }

        int ma = Integer.MIN_VALUE;
        for (int i = 0; i <= (length/2) - 1; i++){
            int n1 = stack.pop();
            int n2 = ref.val;

            ma = Math.max(ma, n1+n2);

            ref = ref.next;
        }

        return ma;
    }
}