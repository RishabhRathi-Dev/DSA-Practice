/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var length : Int = 0
        var headHolder : ListNode? = head

        while(headHolder != null){
            length++
            headHolder = headHolder.next
        }

        if (length == 1){
            return headHolder
        }

        headHolder = head
        var target = length - n - 1

        if (target == -1){
            return headHolder?.next
        }

        length = 0
        while(headHolder != null){
            if (length == target){
                try{
                    headHolder.next = headHolder.next.next
                } catch(e : Exception){
                    headHolder.next = null
                }
            }

            length++
            headHolder = headHolder.next
        }

        return head
    }
}