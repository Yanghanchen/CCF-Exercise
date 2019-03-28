class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums!=null&&nums.length!=0){
            int last=nums[0],count=1,length=nums.length;
            for(int i=1;i<nums.length;i++){
                if(nums[i]==last){
                    count++;
                    if(count==3&&i<length){
                        swap(nums,i,length);
                        length--;
                        count--;
                        if(i<nums.length-1)
                            i--;
                    }
                }else{
                    last=nums[i];
                    count=1;
                }
            }
            return length;
        }
        return 0;
    }

    private void swap(int[] nums, int start, int end) {
        for(int i=start;i<end-1;i++){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
    }

    /*
    大佬做法：
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
    */
}