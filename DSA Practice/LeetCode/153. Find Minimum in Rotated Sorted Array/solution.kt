class Solution {
    fun findMin(nums: IntArray): Int {
        var m = Integer.MAX_VALUE
        var left = 0
        var right = nums.size - 1

        while(left <= right){
            var cm = Math.min(nums[left], nums[right])
            m = Math.min(m, cm)
            left++
            right--
        }

        return m
    }
}