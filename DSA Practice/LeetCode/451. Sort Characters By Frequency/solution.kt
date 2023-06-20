class Solution {
    fun frequencySort(s: String): String {
        val freq = mutableMapOf<Char, Int>()

        for (c in s){
            if (freq.containsKey(c)){
                freq.put(c, freq.get(c)!!.plus(1))
            } else {
                freq.put(c, 1)
            }
        }

        var m = s.length
        var sb = StringBuilder()

        while(sb.length < s.length){
            for ((k, v) in freq){
                if (v == m){
                    for (i in 0..v-1){
                        sb.append(k)
                    }
                    freq.put(k, -1)
                }
            }

            m--
        }

        return sb.toString()
        
    }
}