class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        n1 = set(nums1)
        n2 = set(nums2)
        a1 = n1.difference(n2)
        a2 = n2.difference(n1)

        return [list(a1), list(a2)]