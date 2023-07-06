class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = 0;
        int s = 0;

        int ans = Integer.MAX_VALUE;
        while (left < n){
            if (s >= target){
                ans = Math.min(ans, right - left);
                //System.out.println(left);
                //System.out.print(right);
                //System.out.print(s);
                s -= nums[left];
                left++;
            } else {

                if (right == n){
                    s -= nums[left];
                    left++;
                } else {
                    s += nums[right];
                    right++;
                }
            }
        }

        if (ans == Integer.MAX_VALUE){
            return 0;
        }

        return ans;
        
    }
}