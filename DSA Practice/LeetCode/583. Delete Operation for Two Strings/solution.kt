class Solution {
    fun minDistance(word1: String, word2: String): Int {
        var n : Int = word1.length
        var m : Int = word2.length

        if (n < m) minDistance(word2, word1)

        var dpLast = IntArray(m+1)
        var dpCurr = IntArray(m+1)

        for (c in word1){
            for (j in 0..m-1){
                if (c == word2[j]){
                    dpCurr[j + 1] = dpLast[j] + 1
                } else {
                    dpCurr[j + 1] = Math.max(dpCurr[j], dpLast[j+1])
                }
            }

            var temp = dpLast
            dpLast = dpCurr
            dpCurr = temp
        }

        return (n + m) - (2 * dpLast[m])
    }
}