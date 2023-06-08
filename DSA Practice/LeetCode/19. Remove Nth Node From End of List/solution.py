# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = 0
        headHolder = head

        while (head):
            length+=1
            head = head.next

        if (length == 1):
            return head

        head = headHolder
        target = length - n - 1

        if target == -1:
            return head.next

        length = 0 # reusing as counter
        while(head):
            if length == target:
                try:
                    head.next = head.next.next
                except AttributeError:
                    head.next = None
                break

            length += 1
            head = head.next

        head = headHolder
        return head