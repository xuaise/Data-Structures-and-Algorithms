package meituan;

public class MaxSubArray {
    public int maxSubArray1(int[] nums) {
        int currentSum = nums[0];int maxSum = nums[0];
        for(int i = 0;i<nums.length;i++){
            currentSum = Math.max(currentSum+nums[i],nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public int maxSubArray2(int[] nums){
        int maxSum = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]>0){nums[i] += nums[i-1];}
            maxSum = Math.max(maxSum, nums[i]);
        }
        return maxSum;
    }
}
