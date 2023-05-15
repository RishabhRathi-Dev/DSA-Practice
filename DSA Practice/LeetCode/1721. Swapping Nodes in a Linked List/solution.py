# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        length = 0
        first = 0
        second = 0
        pointer = 0
        temp = head

        while(head):
            pointer += 1

            if (pointer == k):
                first = head.val

            length += 1
            head = head.next

        head = temp

        for _ in range(length - k):
            head = head.next
        
        second = head.val
        head.val = first
        head = temp
        
        pointer = 0
        while(head):
            pointer += 1

            if (pointer == k):
                head.val = second
                break

            head = head.next
        
        head = temp
        return head