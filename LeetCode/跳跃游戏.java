class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        int needstep = 1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=needstep){
                needstep = 1;
            }else{
                needstep++;
            }
            if(i==0&&needstep>1){
                return false;
            }
        }
        return true;
    }
}