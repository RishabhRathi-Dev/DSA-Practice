import java.util.Arrays;
class Solution {
    public int mincostTickets(int[] day, int[] costs) {
        int[] dp = new int[366];
        List days = Arrays.asList(day);
        for (int i = 1; i < 366; i++){
            if (!days.contains(i)){
                dp[i] = dp[i-1];
            } else {
                dp[i] = Math.min(Math.min(dp[i-1] + costs[0], dp[Math.max(0, i-7)] + costs[1]), dp[Math.max(0, i-30)] + costs[2]);
            }
        }

        return dp[365];
    }
}