class Solution {
    public int firstMissingPositive(int[] nums) {
        int count=1;
        if(nums!=null&&nums.length!=0){
            for(int i=0;i<nums.length;){
                if(nums[i]>0&&nums[i]<=nums.length&&nums[nums[i]-1]!=nums[i]){
                    swap(nums,i,nums[i]-1);
                }else{
                    i++;
                }
            }
            for(int i:nums){
                if(i>=1){
                    if(i==count){
                        count++;
                    }else if(i>count){
                        return count;
                    }
                }
            }
        }
        return count;
    }

    private void swap(int[] nums, int i, int i1) {
        int tmp=nums[i];
        nums[i]=nums[i1];
        nums[i1]=tmp;
    }
}