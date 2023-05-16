# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        # Easy memory hogging method
        arr = []

        while(head):
            arr.append(head.val)
            head = head.next

        for i in range(1, len(arr), 2):
            arr[i-1], arr[i] = arr[i], arr[i-1]
        #print(arr)
        temp = ListNode()
        head = temp
        for i in arr:
            temp.next = ListNode(i)
            temp = temp.next
        temp = head
        return temp.next