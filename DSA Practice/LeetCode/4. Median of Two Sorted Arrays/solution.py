class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        f = sorted(nums1 + nums2)
        k = len(f)
        mid = k//2
        median = 0

        if k%2 == 0:
            median = (f[mid] + f[mid-1])/2

        else:
            median = f[mid]

        return median