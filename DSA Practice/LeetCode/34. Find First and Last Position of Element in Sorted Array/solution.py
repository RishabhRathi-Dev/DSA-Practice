class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        left = 0
        right = len(nums)-1
        res = [-1, -1]
        leftStop = False # Flags
        rightStop = False # Flags

        # Two pointer

        while(left <= right):
            if leftStop and rightStop:
                break

            if nums[left] == target:
                res[0] = left
                leftStop = True
            
            if nums[right] == target:
                res[1] = right
                rightStop = True
            
            if not leftStop:
                left += 1

            if not rightStop:
                right -= 1

        return res