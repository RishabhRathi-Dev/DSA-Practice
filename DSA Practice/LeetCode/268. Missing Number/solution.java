class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int c = 0;

        for(int i : nums){
            if (c != i){
                break;
            }
            c++;
        }

        return c;
    }
}