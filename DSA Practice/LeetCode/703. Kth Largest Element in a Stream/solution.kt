class KthLargest(k: Int, nums: IntArray) {
    private val k: Int = k
    private val nums: MutableList<Int> = nums.toMutableList()

    fun add(`val`: Int): Int {
        nums.sort()
        nums.add(`val`)
        nums.sort()
        return nums[nums.size - k]
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */