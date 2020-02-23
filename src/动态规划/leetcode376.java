package 动态规划;

public class leetcode376 {
    public int wiggleMaxLength1(int[] nums) {
        if(nums.length<=2){
            return 2;
        }
        int up = 1;int down = 1;
        for (int i = 0;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                up = down +1;
            }
            else if(nums[i]<nums[i-1]){
                down = up+1;
            }
        }
        return Math.max(up,down);
    }

    public int wiggleMaxLength2(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int prevdiff = nums[1] - nums[0];
        int count = prevdiff != 0 ? 2 : 1;
        for (int i = 2; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if ((diff > 0 && prevdiff <= 0) || (diff < 0 && prevdiff >= 0)) {
                count++;
                prevdiff = diff;
            }
        }
        return count;
    }
}
