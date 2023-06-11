class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        Boolean leftFlag = false;
        Boolean rightFlag = false;

        int[] res = {-1, -1};

        while(left <= right){
            if (leftFlag && rightFlag){
                break;
            }

            if (nums[left] == target){
                res[0] = left;
                leftFlag = true;
            }

            if (nums[right] == target){
                res[1] = right;
                rightFlag = true;
            }

            if (leftFlag == false){
                left++;
            }

            if (rightFlag == false){
                right--;
            }
        }

        return res;
    }
}