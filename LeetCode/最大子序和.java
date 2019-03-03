class Solution {
    //线性遍历
    // public int maxSubArray(int[] nums) {
    //     int result = nums[0];
    //     int sum = 0;
    //     for (int num : nums) {
    //         if (sum > 0)
    //             sum += num;
    //         else
    //             sum = num;
    //         result = Math.max(result, sum);
    //     }
    //     return result;
    // }

    //分治法
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        return maxSubArray(nums,0,nums.length-1);
    }

    private int maxSubArray(int[] nums, int start, int end) {
        if(start==end){
            return nums[start];
        }
        int mid = (start+end)/2;
        int leftMax = maxSubArray(nums,start,mid);
        int rightMax = maxSubArray(nums,mid+1,end);
        int crossMax = maxSubArray(nums,start,mid,end);
        return leftMax>rightMax?(leftMax>crossMax?leftMax:crossMax):(rightMax>crossMax?rightMax:crossMax);
    }

    private int maxSubArray(int[] nums, int start, int mid, int end) {
        int leftSum = Integer.MIN_VALUE>>1;
        int sum = 0;
        int index = mid;
        while(index>=start){
            sum += nums[index];
            if(sum>leftSum){
                leftSum = sum;
            }
            index--;
        }
        int rightSum = Integer.MIN_VALUE>>1;
        sum = 0;
        index = mid+1;
        while(index<=end){
            sum += nums[index];
            if(sum>rightSum){
                rightSum = sum;
            }
            index++;
        }
        return leftSum+rightSum;
    }
}