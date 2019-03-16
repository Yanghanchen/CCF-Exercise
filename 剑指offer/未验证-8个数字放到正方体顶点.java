public class Solution {

    public boolean arrange(int[] nums) {
        return arrange(nums,new int[8],0);
    }

    private boolean arrange(int[] nums, int[] record,int start) {
        if(record[7]!=0){
            if(record[1]+record[2]+record[3]+record[0]==record[5]+record[6]+record[7]+record[4]){
                if(record[0]+record[2]+record[4]+record[6]==record[1]+record[3]+record[5]+record[7]){
                    if(record[0]+record[1]+record[4]+record[5]==record[2]+record[3]+record[6]+record[7]){
                        return true;
                    }
                }
            }
        }else{
            for(int i=0;i<nums.length;i++){
                record[start]=nums[i];
                swap(nums,i,start);
                arrange(nums,record,start+1);
                swap(nums,i,start);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int start) {
        int temp=nums[i];
        nums[i]=nums[start];
        nums[start]=temp;
    }
}