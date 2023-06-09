class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        for (i in letters){
            if (i > target){
                return i
            }
        }
        return letters[0]
    }
}