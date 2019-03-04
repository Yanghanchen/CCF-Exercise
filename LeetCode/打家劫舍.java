class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int n = nums.length;
        int[] rob = new int[n];
        rob[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            rob[i] = Math.max(nums[i] + (i + 2 >= n ? 0 : rob[i + 2]), nums[i + 1] + (i + 3 >= n ? 0 : rob[i + 3]));
        }
        return rob[0];
    }
}