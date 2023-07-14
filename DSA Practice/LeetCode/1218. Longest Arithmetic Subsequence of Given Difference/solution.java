class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();
        int ans = 1;
        for (int i : arr){
            int d = i - difference;

            if (dp.containsKey(d)){
                dp.put(i, dp.get(d)+1);
            } else {
                dp.put(i, 1);
            }

            ans = Math.max(ans, dp.get(i));
        }
        return ans;
    }
}