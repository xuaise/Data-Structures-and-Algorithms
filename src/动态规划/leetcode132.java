package 动态规划;

public class leetcode132 {
    public int minCut(String s) {
        int len = s.length();

        if (len < 2) {
            return 0;
        }
        int[] dp = new int[len];

        for (int i = 0; i < len; i++) {
            dp[i] = i;
        }


        boolean[][] checkPalindrome = new boolean[len][len];
        for (int right = 0; right < len; right++) {

            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || checkPalindrome[left + 1][right - 1])) {
                    checkPalindrome[left][right] = true;
                }
            }
        }


        for (int i = 1; i < len; i++) {
            if (checkPalindrome[0][i]){
                dp[i] = 0;
                continue;
            }

            // 注意：这里是严格，要保证 s[j + 1:i] 至少得有一个字符串
            for (int j = 0; j < i; j++) {
                if (checkPalindrome[j + 1][i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[len - 1];
    }
}
