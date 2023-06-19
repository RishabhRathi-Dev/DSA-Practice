class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        var people = IntArray(n)

        for (t in trust){
            people.set(t.get(0) - 1, -1)
            people.set(t.get(1) - 1, people.get(t.get(1) - 1).plus(1))
        }
        
        var res = -1
        for (p in 0..n-1){
            //print(people.get(p))
            if (people.get(p) == n - 1){
                res = p + 1
                break
            }
        }

        return res

    }
}