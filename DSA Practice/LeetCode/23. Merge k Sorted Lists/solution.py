# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if len(lists) == 0:
            return ListNode(val=None).next

        data = []

        for i in lists:

            while(i):
                data.append(i.val)
                i = i.next

        data = sorted(data)
        if len(data) == 0:
            return ListNode(val=None).next

        head = ListNode()
        headHolder = head
        c = 0
        for i in data:
            temp = ListNode()
            head.val = i
            if c != len(data) - 1:
                head.next = temp
                head = temp
            c += 1

        return headHolder
        