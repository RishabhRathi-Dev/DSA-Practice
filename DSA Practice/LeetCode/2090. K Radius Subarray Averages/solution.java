class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++){
            res[i] = -1;
        }

        if (n < (2*k) + 1){
            return res;
        }

        int left = 0;
        int right = 0;
        long current_sum = 0;
        int d = 2*k + 1;

        while(right < n){
            current_sum += nums[right];
            if (right - left == 2*k){
                res[(int)((right+left)/2)] = (int)(current_sum / d);
                current_sum -= nums[left];
                left++;
            }

            right++;
        }

        return res;
    }
}