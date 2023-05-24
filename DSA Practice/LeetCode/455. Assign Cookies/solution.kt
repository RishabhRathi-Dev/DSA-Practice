class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var g : IntArray = g
        var s : IntArray = s

        g.sort()
        s.sort()

        var count : Int = 0

        for (child in g){
            for (i in s){
                if (i >= child){
                    count++
                    s[s.indexOf(i)] = 0
                    break
                }
            }
            s.sort()
        }

        return count
    }
}