class Solution {
    fun maxArea(height: IntArray): Int {
        var left : Int = 0
        var right : Int = height.size - 1
        var water : Int = 0

        while(left < right){
            water = Math.max(water, (right - left)*Math.min(height[left], height[right]))

            if (height[left] < height[right]){
                left++
            } else {
                right--
            }
        }
        return water
    }
}