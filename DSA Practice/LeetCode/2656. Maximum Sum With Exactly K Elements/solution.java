import java.util.Arrays;
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int s = 0;
        int l = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < k; i++){
            int n = nums[l-1];
            s += n;
            nums[l-1]++;
        }

        return s;
    }
}