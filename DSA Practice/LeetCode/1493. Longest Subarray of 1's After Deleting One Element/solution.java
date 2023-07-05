class Solution {
    public int longestSubarray(int[] nums) {

        int left = 0;
        int right = 0;

        int m = 0;
        int s = 0;
        while(right < nums.length){
            int r = nums[right];
            s += r;

            if (s == right - left || s == right - left + 1){
                m = Math.max(m, s);
            }

            else {
                s -= nums[left];
                left++;
            }

            right++;
        }

        if (m == nums.length){
            m--;
        }

        return m;
    }
}