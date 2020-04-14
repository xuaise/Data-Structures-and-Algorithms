package meituan;

import java.util.HashMap;

public class TwoSums1 {
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> numsHashmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            numsHashmap.put(nums[i],i);
        }

        for(int i = 0;i<nums.length;i++){
            int d =  target-nums[i];
            if(numsHashmap.containsKey(d)&&numsHashmap.get(d)!=i){
                result[0] = i;
                result[1] = numsHashmap.get(d);
            }
        }
        return result;
    }

    public int[] twoSum3(int[] nums, int target){
        HashMap<Integer,Integer> numsHashmap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int d =  target-nums[i];
            if(numsHashmap.containsKey(d)){
                return new int[]{numsHashmap.get(d),i};
            }
            numsHashmap.put(nums[i],i);
        }
        return null;
    }
}
