class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var s : Int = 0
        var m : Int = 0

        for (i in gain){
            s += i
            m = Math.max(m, s)
        }

        return m
    }
}