class Solution {
    fun trailingZeroes(n: Int): Int {

       var cc = 0
       var nn = n
       while (nn > 0){
           cc += nn/5
               nn = nn/5
               }
               return cc  
    }
}