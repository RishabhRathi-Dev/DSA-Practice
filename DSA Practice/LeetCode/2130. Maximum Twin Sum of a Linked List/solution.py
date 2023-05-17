# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        ref = head
        length = 0
        stack = []

        while (head):
            stack.append(head.val)
            length += 1
            head = head.next

        ma = -1

        for i in range(length//2):
            n1 = stack.pop()
            n2 = ref.val

            ma = max(ma, n1 + n2)

            ref = ref.next


        return ma