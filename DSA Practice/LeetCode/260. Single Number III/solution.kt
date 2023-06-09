class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        var m : HashMap<Int, Int?> = HashMap<Int, Int?>()

        for (i in nums){
            if (m.containsKey(i)){
                m.put(i, m.get(i)?.plus(1))
            } else {
                m.put(i, 1)
            }
        }

        var res : IntArray = IntArray(2)
        var index : Int = 0

        for (i in m.keys){
            if (m.get(i) == 1){
                res.set(index, i)
                index++
            }
        }

        return res
    }
}