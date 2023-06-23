class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int res = nums[1] - nums[0];
        int n = nums.length;
        for (int i = 2; i < n; i++)
            res = Math.min(res, nums[i] - nums[i - 1]);
        return res;
    }
}