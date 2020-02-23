package 贪心算法;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode122 {
    /**
     * 将每次的利润做折线图，发现每次的波峰与波谷依次加为最大利润，
     * 如果第一个波谷与第二个波峰之间的差做某次利润，其结果必然小于等于前面一种情况
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int i = 0;
        int peak = prices[0]; //最小价格
        int vallery = prices[0];  //最大价格
        int maxprofit = 0;

        while (i<prices.length-1){
            while (i<prices.length-1&&prices[i]>=prices[i+1]){   //寻找此次波谷
                i++;
            }
            peak = prices[i];
            while (i<prices.length-1&&prices[i]<=prices[i+1]){  //寻找此次波峰
                i++;
            }
            vallery = prices[i];
            maxprofit+= vallery-peak;       //波峰-波谷即为此次利润，所有利润和所加即为最大利润
        }
        return maxprofit;
    }


    /**
     * 若某段波连续递增，取峰值，而不是波谷i市，取i+1时的值
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
