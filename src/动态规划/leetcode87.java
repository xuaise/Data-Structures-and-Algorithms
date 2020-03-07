package 动态规划;

public class leetcode87 {
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        if(s1.length()==0)
            return false;
        boolean[][][] dp = new boolean[s1.length()][s2.length()][s1.length()+1];
        int n=s1.length();
        for(int i=0;i<n;i++){//切片l是1的时候直接判断两个字符是否相等就好
            for(int j=0;j<n;j++){
                dp[i][j][1]= s1.charAt(i)==s2.charAt(j);
            }
        }
        for(int l=2; l<=n;l++)//切片从小到大
            for(int i=0;i<n-l+1;i++)
                for(int j=0;j<n-l+1;j++){//依次遍历S、T
                    for(int k=1;k<l;k++){//对长度为l的S(i:i+L)和T(j:j+L)字符串模仿递归进行切片判断
                        if(dp[i][j][k]&&dp[i+k][j+k][l-k]){
                            dp[i][j][l]=true;
                            break;
                        }

                        if(dp[i][j+l-k][k]&&dp[i+k][j][l-k]){
                            dp[i][j][l]=true;
                            break;
                        }

                    }
                }
        return dp[0][0][n];
    }
}
