class Solution {
    fun missingNumber(nums: IntArray): Int {
        Arrays.sort(nums)

        var c = 0

        for (i in nums){
            if (i != c){
                break
            }
            c++
        }

        return c
    }
}