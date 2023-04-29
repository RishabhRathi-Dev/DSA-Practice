# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next

class Solution:
    def getNumber(self, l):
        num = 0
        power = 0
        a = l

        while a != None:
            num += a.val * 10**power
            power += 1
            a = a.next

        return num

    def numToNode(self, n):
        div = 10
        head = None
        num = []
        
        if n == 0:
            num.append(0)

        while n != 0:
            val = n%div
            num.append(val)
            n = n // div

        

        for val in num[::-1]:
            head = ListNode(val, head)

        return head
        

    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:   
        n1 = self.getNumber(l1)
        n2 = self.getNumber(l2)
        s = n1 + n2
        ans = self.numToNode(s)

        return ans
