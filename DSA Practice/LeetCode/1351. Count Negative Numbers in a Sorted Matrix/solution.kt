class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count : Int = 0
        for(row in grid){
            for(cell in row){
                if (cell < 0){
                    count++
                }
            }
        }
        return count
    }
}