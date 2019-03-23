class Solution {
    public int search(int[] nums, int target) {
        if(nums!=null&&nums.length!=0){
            int low=0,high=nums.length-1;
            while(low<=high){
                int mid=(low+high)>>1;
                if(nums[mid]==target){
                    return mid;
                }
                if(target>=nums[low]&&target<nums[mid]||(nums[low]>nums[mid]&&(target>=nums[low]||target<nums[mid]))){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}