class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] part1 = new int[k];
        int[] part2 = new int[nums.length - k];
        for (int i = 0; i < nums.length; i++){
            if (i < nums.length - k){
                part2[i] = nums[i];
            } else {
                part1[i-(nums.length - k)] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++){
            if (i < k){
                nums[i] = part1[i];
            } else {
                nums[i] = part2[i-k];
            }
        }
    }
}