package 动态规划;

public class leetcode265 {public int minCostII(int[][] costs) {
    if (costs.length == 0) {
        return 0;
    } else if (costs[0].length == 1) {
        return costs[0][0];
    }

    int minColour = -1;
    int minCost = 0;
    int secondMinCost = 0;
    for (int[] cost : costs) {
        int tmpMinColour = -1;
        int tmpMinCost = Integer.MAX_VALUE;
        int tmpSecondMinCost = Integer.MAX_VALUE;
        for (int i = 0; i < cost.length; i++) {
            int thisMinCost = cost[i] + (i == minColour ? secondMinCost : minCost);

            if (thisMinCost < tmpMinCost) {
                tmpSecondMinCost = tmpMinCost;
                tmpMinCost = thisMinCost;
                tmpMinColour = i;
            } else if (thisMinCost < tmpSecondMinCost) {
                tmpSecondMinCost = thisMinCost;
            }
        }
        minCost = tmpMinCost;
        minColour = tmpMinColour;
        secondMinCost = tmpSecondMinCost;
    }

    return minCost;
}
}
