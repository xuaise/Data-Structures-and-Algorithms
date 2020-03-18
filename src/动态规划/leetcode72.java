package 动态规划;

/**
 * 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
 *
 * 你可以对一个单词进行如下三种操作：
 *
 *     插入一个字符
 *     删除一个字符
 *     替换一个字符
 *
 *     思路：构建二维数组代表两个字符串前i个和前j个变换次数，动态方程
 *     若word1[i] = word2[i]  D[i][j]=1+min(D[i−1][j],D[i][j−1],D[i−1][j−1]−1)
 *     否则                   D[i][j]=1+min(D[i−1][j],D[i][j−1],D[i−1][j−1])
 *     初态       D[i][0] = i    D[0][j] = j
 */
public class leetcode72 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n * m == 0)
            return n + m;
        int [][] d = new int[n + 1][m + 1];


        for (int i = 0; i < n + 1; i++) {
            d[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            d[0][j] = j;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int left = d[i - 1][j] + 1;
                int down = d[i][j - 1] + 1;
                int left_down = d[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1))
                    left_down += 1;
                d[i][j] = Math.min(left, Math.min(down, left_down));

            }
        }
        return d[n][m];
    }
}
