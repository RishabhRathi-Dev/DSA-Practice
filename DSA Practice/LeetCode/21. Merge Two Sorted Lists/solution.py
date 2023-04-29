# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        def toArray(a):
            temp = []

            while a != None:
                temp.append(a.val)
                a = a.next

            return temp

        l1 = toArray(list1)
        l2 = toArray(list2)

        l3 = sorted(l1+l2)
        
        head = None

        for i in l3[::-1]:
            head = ListNode(i, head)

        return head