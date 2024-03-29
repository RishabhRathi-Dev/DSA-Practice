class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int i: nums){
            if (i == 0){
                return 0;
            } else if (i < 0){
                sign *= -1;
            } else {
                sign *= 1;
            }
        }

        return sign;
        
    }
}