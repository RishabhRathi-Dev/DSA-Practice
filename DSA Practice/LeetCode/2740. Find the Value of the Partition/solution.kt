class Solution {
    fun findValueOfPartition(nums: IntArray): Int {
        Arrays.sort(nums)
        var res = nums.get(1) - nums.get(0)
        val n = nums.size

        for (i in 2..n-1){
            res = Math.min(res, nums.get(i) - nums.get(i-1))
        }

        return res

    }
}