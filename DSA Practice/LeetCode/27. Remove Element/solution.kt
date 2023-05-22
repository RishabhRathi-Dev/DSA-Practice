class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var counter = 0

        for (i in nums) {
            if (i != `val`) {
                nums[counter] = i
                counter++
            }
        }

        return counter
    }

}