class Solution {
    fun getAverages(nums: IntArray, k: Int): IntArray {
        var n = nums.size
        var res : IntArray = IntArray(n) {-1}

        if (n < (2*k) + 1){
            return res
        }

        var left : Int = 0
        var right : Int = 0
        var current_sum : Long = 0L
        val d : Int = (2*k) + 1

        while (right < n){
            current_sum += nums.get(right)

            if (right - left == 2*k){
                res.set(((right + left) / 2).toInt(), (current_sum / d).toInt())
                current_sum -= nums.get(left)
                left++
            }

            right++
        }

        return res
    }
}