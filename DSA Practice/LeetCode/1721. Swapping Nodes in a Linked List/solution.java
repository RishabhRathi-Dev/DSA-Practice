
//Definition for singly-linked list.
/*
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 */
 
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int toSwap = 0;
        int swapWith = 0;
        int pointer = 0;
        int length = 0;

        ListNode temp = head;

        // get data for to swap
        while(head != null){
            pointer++;
            if (pointer == k){
                toSwap = head.val;
            }

            length++;
            head = head.next;
        }

        head = temp;

        if (length == 1){
            return head;
        }

        // toSwap
        for(int i = 0; i <= length - k - 1; i++){
            head = head.next;
        }

        swapWith = head.val;
        head.val = toSwap;
        head = temp;

        pointer = 0;
        // Swap
        while(head != null){
            pointer++;

            //System.out.println(head.val);
            if (pointer == k){
                head.val = swapWith;
                break;
            }

            head = head.next;
        }

        /*
        System.out.println(toSwap);
        System.out.println(length);
        System.out.println(swapWith);
        */

        head = temp;

        return head;
    }
}