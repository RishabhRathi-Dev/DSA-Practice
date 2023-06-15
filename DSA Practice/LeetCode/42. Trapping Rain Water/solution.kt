class Solution {
    fun trap(height: IntArray): Int {
        var left : Int = 0
        var right : Int = height.size - 1
        var water : Int = 0
        var left_max : Int = 0
        var right_max : Int = 0

        while (left < right){

            if (height[left] < height[right]){
                if(height[left] < left_max){
                    water += left_max - height[left]
                } else {
                    left_max = height[left]
                }

                left++

            } else {
                if(height[right] < right_max){
                    water += right_max - height[right]
                } else {
                    right_max = height[right]
                }

                right--
            }
        }

        return water
    }
}