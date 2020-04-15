package meituan;

import java.util.Arrays;

public class ThreeSumCloest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<nums.length;i++){
            int l = i+1;int r=nums.length-1;
            while (l<r){
                int tmp = nums[l]+nums[r]+nums[i];
                if(Math.abs(target-tmp)<Math.abs(target-ans)){
                    ans = tmp;
                }
                if(tmp<target){
                    l++;
                }
                else if(tmp>target){
                    r--;
                }
                else{
                    return tmp;
                }
            }
        }
        return ans;
    }
}
