package meituan;

public class FirstLastPosition {
    public int[] searchRange1(int[] nums, int target) {
        double tar = target;
        int Lindex = search(nums, tar-0.5);
        int Rindex = search(nums,tar+0.5);
        if(Lindex == nums.length||Rindex-1<Lindex){return new int[]{-1,-1};}
        return new int[]{Lindex,Rindex-1};
    }


    public int search(int[] nums,double target){
        int i = 0;int j = nums.length-1;
        int mid = (i+j)/2;
        while (i<=j){
            mid = (i+j)/2;
            if(nums[mid] == target) {return mid;}
            else if(nums[mid]>target) {
                j = mid-1;
            }
            else if(nums[mid]<target){
                i = mid+1;
            }

        }
        return i;
    }
}
