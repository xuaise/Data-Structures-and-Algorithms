package 动态规划;

public class leetcode256 {
    public int minCost(int[][] costs) {
        int preR = 0;	int curR = 0;
        int preB = 0;	int curB = 0;
        int preG = 0;	int curG = 0;

        for (int i = 0; i < costs.length; i++) {
            curR = Math.min(preB, preG) + costs[i][0];
            curB = Math.min(preR, preG) + costs[i][1];
            curG = Math.min(preR, preB) + costs[i][2];
            preR = curR;
            preB = curB;
            preG = curG;
        }

        return Math.min(Math.min(curR, curB), curG);
    }
}
