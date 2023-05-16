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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(head != null){
            arr.add(head.val);
            head = head.next;
        }

        for (int i = 1; i < arr.size(); i+=2){
            int temp = arr.get(i);
            arr.set(i, arr.get(i-1));
            arr.set(i-1, temp);
        }

        ListNode temp = new ListNode();
        ListNode ref = temp;
        for (int i : arr){
            temp.next = new ListNode(i);
            temp = temp.next;
        }

        temp = ref;
        return temp.next;
    }
}