class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&i!=nums.length-1){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        swap(nums,i,j);
                        break;
                    }
                }
            }
        }
        System.out.println(nums);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}