package 双指针;

import java.util.Arrays;

public class leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<3){
            return Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];;
        for(int i = 0;i<nums.length;i++){
            int start = i+1;int end =nums.length-1;
            while (start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if((Math.abs(target-result)>Math.abs(target-sum))){
                    result = sum;
                }
                if(sum<target){
                    start++;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    return result;
                }
            }
        }
        return result;
    }
}
