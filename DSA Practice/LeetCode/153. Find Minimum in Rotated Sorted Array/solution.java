class Solution {
    public int findMin(int[] nums) {
        int m = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int cm = Math.min(nums[left], nums[right]);
            m = Math.min(m, cm);
            left++;
            right--;
        }

        return m;
    }
}