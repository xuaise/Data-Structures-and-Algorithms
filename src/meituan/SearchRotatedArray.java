package meituan;

public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int index = getMinIndex(nums);
        if(index == 0) return search(nums, 0, nums.length-1, target);
        int li = search(nums,0,index,target);
        int ri = search(nums,index,nums.length-1,target);
        return li==0?ri:li;
    }
    public int getMinIndex(int[] nums){
        int i = 0; int j = nums.length-1;
        while (i<=j){
            int mid = (i+j)/2;
            if(nums[mid]>nums[mid+1]) return mid+1;
            else {
                if(nums[mid]<nums[i]){j = mid-1;}
                else  {i = mid+1;}
            }
        }
        return 0;
    }
    public int search (int[] nums,int left,int right,int target){
        while (left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]) {return mid;}
            else if(target<nums[mid]){
                right = mid -1;
            }
            else{
                left = mid+1;
            }
        }
        return 0;
    }
}
