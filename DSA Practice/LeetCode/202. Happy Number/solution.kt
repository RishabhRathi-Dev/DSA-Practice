class Solution {
    fun isHappy(n: Int): Boolean {
        var holder : Int = n
        if (holder == 1 || holder == 7){
            return true
        }

        while(holder > 1){
            var temp : Int = holder
            var s : Int = 0
            while(temp > 0){
                var rem : Int = temp%10
                s += rem*rem
                temp /= 10
            }

            holder = s

            if (holder == 1 || holder == 7){
                return true
            } else if (holder < 10){
                return false
            }
        }

        return false
    }
}