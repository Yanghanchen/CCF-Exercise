class Solution {
    public boolean search(int[] nums, int target) {
        if(nums!=null&&nums.length!=0) {
            int point = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    point = i;
                    break;
                }
            }
            if(nums[point]==target){
                return true;
            }else {
                if(binarySearch(nums,target,0,point-1)){
                    return true;
                }
                if(binarySearch(nums,target,point+1,nums.length-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)>>1;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}