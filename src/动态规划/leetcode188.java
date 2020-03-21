package 动态规划;

public class leetcode188 {
    public int maxProfit(int k, int[] prices) {

        int max_k = k;
        int n = prices.length;
        if(n<=1) return 0;
        if (max_k > n / 2)
            return maxProfit_k_inf(prices);

        int[][][] dp = new int[n][max_k + 1][2];
        for (int i = 0; i < n; i++)
            for (int t = max_k; t >= 1; t--) {
                if (i - 1 == -1) {
                    /* 处理 base case */
                    dp[i][t][0] = 0;
                    dp[i][t][1] = -prices[i];
                    continue;
                }
                dp[i][t][0] = Math.max(dp[i-1][t][0], dp[i-1][t][1] + prices[i]);
                dp[i][t][1] = Math.max(dp[i-1][t][1], dp[i-1][t-1][0] - prices[i]);
            }
        return dp[n - 1][max_k][0];
    }

    int maxProfit_k_inf(int[] prices) {
        int n = prices.length;
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, temp - prices[i]);
        }
        return dp_i_0;
    }
}
