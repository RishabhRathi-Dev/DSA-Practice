class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var kalt = k
        kalt = kalt%nums.size
        
        var part1 = nums.slice((nums.size - kalt)..(nums.size - 1))
        var part2 = nums.slice(0..(nums.size-kalt-1))

        for (i in 0..nums.size-1){
            if (i < kalt){
                nums.set(i, part1.get(i))
            } else {
                nums.set(i, part2.get(i-kalt))
            }
        }
    }
}