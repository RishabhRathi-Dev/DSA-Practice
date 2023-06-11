class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1
        var leftFlag = false
        var rightFlag = false

        var res : IntArray = IntArray(2) {-1}

        while(left <= right){
            if (leftFlag && rightFlag){
                break
            }

            if (nums[left] == target){
                res[0] = left
                leftFlag = true
            }

            if (nums[right] == target){
                res[1] = right
                rightFlag = true
            }

            if (leftFlag == false){
                left++
            }

            if (rightFlag == false){
                right--
            }
        }

        return res
    }
}